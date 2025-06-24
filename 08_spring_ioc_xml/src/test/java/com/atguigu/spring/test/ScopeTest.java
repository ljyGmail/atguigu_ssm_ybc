package com.atguigu.spring.test;

import com.atguigu.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: ScopeTest
 * Package: com.atguigu.spring.test
 * Description:
 *
 * @Author ljy
 * @Create 2025-06-24 오전 11:48
 * @Version 1.0
 */
public class ScopeTest {

    @Test
    public void testScope() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-scope.xml");
        Student student1 = ioc.getBean(Student.class);
        Student student2 = ioc.getBean(Student.class);
        System.out.println(student1 == student2);
    }
}
