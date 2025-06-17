package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.SelectMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class SelectMapperTest {

    @Test
    public void testGetUserById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User user = mapper.getUserById(1);
        System.out.println("user: " + user);
    }

    @Test
    public void testGetAllUsers() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> list = mapper.getAllUsers();
        list.forEach(System.out::println);
    }

    @Test
    public void testGetCount() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Integer count = mapper.getCount();
        System.out.println("count: " + count);
    }

    @Test
    public void testGetUserByIdToMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> map = mapper.getUserByIdToMap(3);
        // {password=123456, gender=男, id=1, age=23, email=123@qq.com, username=admin}
        // {password=445566, id=3, username=ljy} 对于值为NULL的列，map中不会存储该列的键值对
        System.out.println("map: " + map);
    }

    @Test
    public void testGetAllUsersToMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        // List<Map<String, Object>> list = mapper.getAllUsersToMap();
        // list.forEach(System.out::println);
        Map<String, Object> map = mapper.getAllUsersToMap();
        System.out.println("map: " + map);
        /*
        map: {
        1={password=123456, gender=男, id=1, age=23, email=123@qq.com, username=admin},
        2={password=654321, gender=女, id=2, age=44, email=ybc@atgugu.com, username=root},
        3={password=445566, id=3, username=ljy}}
         */
    }
}
