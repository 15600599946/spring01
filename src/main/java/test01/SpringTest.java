package test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Student;
import pojo.Teacher;
import pojo.User;
import service.UserService;
import service.impl.UserServiceImpl;

public class SpringTest {
    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserService userService1_1 = (UserService) context.getBean("userService");
        UserService userService1_2 = (UserService) context.getBean("userService");
        //从spring工厂中拿出的是一个单例bean
        //构造方法获取
        System.out.println("构造方法获取");
        System.out.println(userService1_1);
        System.out.println(userService1_2);
        //静态工厂获取
        System.out.println("静态工厂获取");
        UserService userService2 = (UserService) context.getBean("userService2");
        System.out.println(userService2);
        //实例工厂
        System.out.println("实例工厂获取");
        UserService userService3 = (UserService) context.getBean("userService3");
        System.out.println(userService3);

        // 用alias标签修改别名
        UserService aaa = (UserService) context.getBean("aaa");
        System.out.println(aaa);
        UserService bbb = (UserService) context.getBean("bbb");
        System.out.println(bbb);
        UserService ccc = (UserService) context.getBean("ccc");
        System.out.println(ccc);
        UserService ddd = (UserService) context.getBean("ddd");
        System.out.println(ddd);
        UserService eee = (UserService) context.getBean("eee");
        System.out.println(eee);

        //通过类型获取bean 多个相同类型的Bean存在 会报错 所以需要用名称 id进行区分
        UserServiceImpl bbb1 = context.getBean("bbb", UserServiceImpl.class);
        System.out.println(bbb1);

        //通过构造方法创建对象 默认无参创建 但是没有无感构造时候 会报错
        /*
        Caused by: java.lang.NoSuchMethodException: pojo.User.<init>()
            at java.lang.Class.getConstructor0(Class.java:3082)
            at java.lang.Class.getDeclaredConstructor(Class.java:2178)
            at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:78)
            ... 14 more
         */
        User user = (User) context.getBean("user");
        User user2 = (User) context.getBean("user");
        User user3 = (User) context.getBean("user");
        User user4 = (User) context.getBean("user");
        System.out.println(user==user2);
        System.out.println(user2==user3);
        System.out.println(user3==user4);
        System.out.println(user4==user);

        User u1= new User();
        System.out.println(u1);

        //    <bean id="student" class="pojo.Student" c:name="庄浩松" c:age="999" scope="singleton"/>
        ApplicationContext context1 = new ClassPathXmlApplicationContext("application.xml");
        Student student1 = (Student) context1.getBean("student");
        ApplicationContext context2 = new ClassPathXmlApplicationContext("application.xml");
        Student student2 = (Student) context2.getBean("student");

        System.out.println(student2 == student1);
        Student student3 = (Student) context1.getBean("student");
        System.out.println(student3 == student1);


//        懒加载 不获取实例 不加载到spring容器中去
        Teacher teacher = (Teacher) context.getBean("teacher");


    }
}
