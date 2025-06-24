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
     * 3. 后置处理器的postProcessBeforeInitializaiton
     * 4. 初始化，需要通过bean的init-method属性指定初始化的方法
     * 5. 后置处理器的postProcessAfterInitialization
     * 6. IOC容器关闭时销毁，需要通过bean的destroy-method属性指定销毁的方法
     * <p>
     * bean的后置处理器会在生命周期的初始化前后添加额外的操作
     * 需要实现BeanPostProcessor接口且配置到IOC容器中
     * 需要注意的是，bean后置处理器不是单独针对某一个bean生效，而是针对IOC容器中所有的bean都会执行
     * <p>
     * 注意:
     * 若bean的作用域为单例时，生命周期的前三个步骤会在获取IOC容器时执行
     * 若bean的作用域为多例时，生命周期的前三个步骤会在获取bean时执行
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
