package com.atguigu.spring.test;

import com.atguigu.spring.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ClassName: B_TxByAnnotationTest
 * Package: com.atguigu.spring.test
 * Description:
 * 声明式事务的配置步骤:
 * 1. 在Spring的配置文件中配置事务管理器
 * 2. 开启事务的注解驱动
 * 在需要被事务管理的方法上，添加@Transactional注解，该方法就会被事务管理
 * <p>
 * \@Transactional注解标识的位置:
 * 1. 标识在方法上
 * 2. 标识在类上，则类中所有的方法都会被事务管理
 *
 * @Author: ljy
 * @Create: 2025. 7. 1. 오후 11:37
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx-annotation.xml")
public class B_TxByAnnotationTest {

    @Autowired
    private BookController bookController;

    @Test
    public void testByBook() {
        bookController.buyBook(1, 3);
    }
}
