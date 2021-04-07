package service;

import Entity.UserInfo;

import java.util.List;

/**
 * Created by Tony on 2016/12/10.
 */
public interface UserService {

    String sayHello(String name);

    List<UserInfo> getList();

}
