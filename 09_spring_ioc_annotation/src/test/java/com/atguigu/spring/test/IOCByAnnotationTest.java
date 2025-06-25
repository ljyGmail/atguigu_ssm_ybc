package com.atguigu.spring.test;

import com.atguigu.spring.controller.UserController;
import com.atguigu.spring.dao.UserDao;
import com.atguigu.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: IOCByAnnotationTest
 * Package: com.atguigu.spring.test
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 25. 오후 3:08
 * @Version 1.0
 */
public class IOCByAnnotationTest {

    /**
     * @Component: 将类标识为普通组件
     * @Controller: 将类标识为控制层组件
     * @Service: 将类标识为业务层组件
     * @Repository: 将类标识为持久层组件
     * <p>
     * 通过注解，扫描所配置的bean的id，默认值为类名的小驼峰，即类名的首字母为小写的结果
     * 可以通过标识组件的注解的value属性值设置bean的自定义的id。
     * <p>
     * @Autowired: 实现自动装配功能的注解
     * a> 标识在成员变量上，此时不需要设置成员变量的set方法
     * b> 标识在set方法上
     * c> 标识在 为当前成员变量赋值的有参构造器上
     */

    @Test
    public void testAnnotation() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController = ioc.getBean(UserController.class);
        System.out.println("userController: " + userController);
        UserService userService = ioc.getBean(UserService.class);
        System.out.println("userService: " + userService);
        UserDao userDao = ioc.getBean(UserDao.class);
        System.out.println("userDao: " + userDao);

        System.out.println("------------------");

        UserController userController1 = ioc.getBean("userController", UserController.class);
        System.out.println("userController1: " + userController1);
        // 为bean指定自定义id的情况
        // UserController myController = ioc.getBean("myController", UserController.class);
        // System.out.println("myController: " + myController);
        UserService userService1 = ioc.getBean("userServiceImpl", UserService.class);
        System.out.println("userService1: " + userService1);
        UserDao userDao1 = ioc.getBean("userDaoImpl", UserDao.class);
        System.out.println("userDao1: " + userDao1);
    }

    @Test
    public void testAutowired() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController = ioc.getBean(UserController.class);
        userController.saveUser();
    }
}
