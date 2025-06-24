package com.atguigu.spring.test;

import com.atguigu.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: LifeCycleTest
 * Package: com.atguigu.spring.test
 * Description:
 *
 * @Author ljy
 * @Create 2025-06-24 오후 12:02
 * @Version 1.0
 */
public class LifeCycleTest {

    /**
     * 1. 实例化
     * 2. 依赖注入
     * 3. 初始化，需要通过bean的init-method属性指定初始化的方法
     * 4. IOC容器关闭时销毁，需要通过bean的destroy-method属性指定销毁的方法
     */
    @Test
    public void testLifeCycle() {
        // ConfigurableApplicationContext是ApplicationContext的子接口，其中扩展了刷新和关闭容器的方法
        ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        User user = ioc.getBean(User.class);
        System.out.println("user: " + user);
        ioc.close();
    }
}
