package factory;

import service.UserService;
import service.impl.UserServiceImpl;

public class FactoryBean {
    public UserService getInstance(){
        return new UserServiceImpl();
    }
}
