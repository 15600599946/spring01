package service.impl;

import service.UserService;

public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
        System.out.println("调用了本类的无参构造方法");
    }

    @Override
    public int addUser() {
        return 0;
    }


}
