package com.atguigu.spring.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * ClassName: DataSourceTest
 * Package: com.atguigu.spring.test
 * Description:
 *
 * @Author ljy
 * @Create 2025-06-24 오전 11:06
 * @Version 1.0
 */
public class DataSourceTest {

    @Test
    public void testDataSource() throws SQLException {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-datasource.xml");
        DruidDataSource dataSource = ioc.getBean(DruidDataSource.class);
        System.out.println("connection: " + dataSource.getConnection());
    }
}
