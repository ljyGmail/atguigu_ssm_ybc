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
    }
}
