package com.atguigu.spring.test;

import com.atguigu.spring.aop.annotation.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: AOPTest
 * Package: com.atguigu.spring.test
 * Description:
 *
 * @Author liangjinyong
 * @Create 2025-06-29 오후 2:35
 * @Version 1.0
 */
public class AOPTest {

    @Test
    public void testAOPByAnnotation() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");
        // 无法直接获取目标对象
        // CalculatorImpl calculator = ioc.getBean(CalculatorImpl.class);
        // calculator.add(1, 2);
        Calculator calculator = ioc.getBean(Calculator.class);
        // calculator.add(1, 2);
        // calculator.sub(4, 2);
        // calculator.mul(2, 3);
        calculator.div(4, 2);
    }
}
