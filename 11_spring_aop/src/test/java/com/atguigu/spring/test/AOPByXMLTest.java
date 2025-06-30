package com.atguigu.spring.test;

import com.atguigu.spring.aop.xml.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: AOPByXMLTest
 * Package: com.atguigu.spring.test
 * Description:
 *
 * @Author liangjinyong
 * @Create 2025-06-30 오전 11:35
 * @Version 1.0
 */
public class AOPByXMLTest {

    @Test
    public void testAOPByXML() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-xml.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.mul(3, 5);
    }
}
