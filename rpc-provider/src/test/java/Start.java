import java.io.*;
import java.net.URL;

/**
 * Created by Tony on 2016/12/10.
 */
public class Start {
    public static void main(String[] args) throws IOException {

        com.alibaba.dubbo.container.Main.main(args);

//        InputStream stream = Start.class.getClassLoader().getResourceAsStream("META-INF/spring/dubbo-provider.xml");
//        if(stream != null){
//            System.out.println("getstreat");
//
//            InputStreamReader reader = new InputStreamReader(stream);
//
//            int tempChar = 0;
//            while ( (tempChar = reader.read()) != -1){
//                System.out.print((char) tempChar);
//            }
//        }



    }
}
