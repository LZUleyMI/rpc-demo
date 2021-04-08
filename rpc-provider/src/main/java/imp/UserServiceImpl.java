package imp;

import Entity.UserInfo;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tony on 2016/12/10.
 */
public class UserServiceImpl implements UserService {
    public String sayHello(String name) {
        return String.format("hello",name);
    }

    public List<UserInfo> getList() {
        UserInfo user = new UserInfo();
        user.setAge(10);
        user.setName("tony");
        user.setSex(1);

        UserInfo u1 = new UserInfo();
        u1.setName("ton1");
        u1.setAge(10);
        u1.setSex(1);

        List<UserInfo> list = new ArrayList<UserInfo>();
        list.add(user);
        list.add(u1);
        return list;

    }
}
