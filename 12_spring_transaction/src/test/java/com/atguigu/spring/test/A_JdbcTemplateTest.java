package com.atguigu.spring.test;

import com.atguigu.spring.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * ClassName: JdbcTemplateTest
 * Package: com.atguigu.spring.test
 * Description:
 *
 * @Author liangjinyong
 * @Create 2025-06-30 오후 11:22
 * @Version 1.0
 */
// 指定当前类在Spring的测试环境中执行，此时就可以通过注入的方式直接获取IOC容器中的bean
@RunWith(SpringJUnit4ClassRunner.class)
// 设置Spring测试环境的配置文件
@ContextConfiguration("classpath:spring-jdbc.xml")
public class A_JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testInsert() {
        String sql = "insert into t_user values(null, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, "root", "445566", 26, "女", "123@qq.com");
    }

    @Test
    public void testGetUserById() {
        String sql = "select * from t_user where id = ?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 1);
        System.out.println("user: " + user);
    }

    @Test
    public void getAllUsers() {
        String sql = "select * from t_user";
        List<User> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        list.forEach(System.out::println);
    }

    @Test
    public void getGetCount() {
        String sql = "select count(*) from t_user";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println("count: " + count);
    }
}
