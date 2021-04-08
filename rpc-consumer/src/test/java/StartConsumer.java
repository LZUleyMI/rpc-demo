import Entity.UserInfo;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

import java.util.List;

/**
 * Created by Tony on 2016/12/11.
 */
public class StartConsumer {
    public static void main(String[] args) {
        //com.alibaba.dubbo.container.Main.main(args);

        System.out.println("after start");

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:META-INF/spring/spring-context.xml");

        context.start();

        UserService thisService = (UserService) context.getBean("userService");

        if(null != thisService){
            String value = thisService.sayHello("tony");
            System.out.println(value);

            List<UserInfo> userList = thisService.getList();
            for (UserInfo user:
                 userList) {
                System.out.println("userName:" + user.getName());
            }
        }else{
            System.err.println("生成代理失败！");
        }




    }
}
