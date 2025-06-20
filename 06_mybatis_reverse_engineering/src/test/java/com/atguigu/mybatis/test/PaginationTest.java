package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * ClassName: PaginationTest
 * Package: com.atguigu.mybatis.test
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 20. 오후 5:50
 * @Version 1.0
 */
public class PaginationTest {

    @Test
    public void testPagination() {

        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        // 查询之前开启分页功能
        PageHelper.startPage(3, 4);
        List<Emp> list = mapper.selectByExample(null);
        list.forEach(System.out::println);
    }
}
