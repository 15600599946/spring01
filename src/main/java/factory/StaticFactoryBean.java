package factory;

import service.UserService;
import service.impl.UserServiceImpl;

public class StaticFactoryBean {
    public static UserService getInstance(){
        return new UserServiceImpl();
    }
}
