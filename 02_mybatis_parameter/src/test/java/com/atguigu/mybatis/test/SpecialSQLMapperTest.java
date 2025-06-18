package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.SpecialSQLMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

/**
 * ClassName: SpecialSQLMapperTest
 * Package: com.atguigu.mybatis.test
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 18. 오전 11:57
 * @Version 1.0
 */
public class SpecialSQLMapperTest {

    @Test
    public void testGetUserByLike() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> list = mapper.getUserByLike("a");
        list.forEach(System.out::println);
    }

    // 下面这段代码演示为什么在sql映射文件中直接写like '%#{xxx}%'会报错
    public void testJDBC() {
        try {
            Class.forName("");
            Connection connection = DriverManager.getConnection("", "", "");
            String sql = "select * from t_user where username like '%?%'";
            PreparedStatement ps = connection.prepareStatement(sql);
            // 下面这行代码编译不通过，因为sql语句中的问号在字符串内部
            // ps.setString(1, "a");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
