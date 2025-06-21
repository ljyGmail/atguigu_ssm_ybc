package com.atguigu.spring.test;

import com.atguigu.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: IOCByXMLTest
 * Package: com.atguigu.spring.test
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 21. 오후 12:01
 * @Version 1.0
 */
public class IOCByXMLTest {

    @Test
    public void testIOC() {
        // 获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        // 获取bean
        Student studentOne = (Student) ioc.getBean("studentOne");
        System.out.println("studentOne: " + studentOne);
    }
}
