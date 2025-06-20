package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.CacheMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * ClassName: CacheMapperTest
 * Package: com.atguigu.mybatis.test
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 20. 오전 11:13
 * @Version 1.0
 */
public class CacheMapperTest {
    /**
     * MyBatis的一级缓存:
     * MyBatis的一级缓存是SqlSession级别的，即通过同一个SqlSession查询的数据会被缓存。
     * 再次使用同一个SqlSession查询同一条数据，会从缓存中获取。
     * <p>
     * 使一级缓存失效的四种情况:
     * 1) 不同的SqlSession对应不同的一级缓存
     * 2) 同一个SqlSession但是查询条件不同
     * 3) 同一个SqlSession两次查询期间执行了任何一次增删改查操作
     * 4) 同一个SqlSession两次查询期间手动清空了缓存
     */

    @Test
    public void testGetEmpById() {
        SqlSession sqlSession1 = SqlSessionUtil.getSqlSession();
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        Emp emp1 = mapper1.getEmpById(1);
        System.out.println("emp1: " + emp1);

        // 3) 同一个SqlSession两次查询期间执行了任何一次增删改查操作
        // mapper1.insertEmp(new Emp(null, "小蓝", 26, "女"));

        // 4) 同一个SqlSession两次查询期间手动清空了缓存
        sqlSession1.clearCache();

        Emp emp2 = mapper1.getEmpById(1);
        System.out.println("emp2: " + emp2);

        // 1) 不同的SqlSession对应不同的一级缓存
        /*
        SqlSession sqlSession2 = SqlSessionUtil.getSqlSession();
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp emp3 = mapper2.getEmpById(1);
        System.out.println("emp3" + emp3);
         */

        // 2) 同一个SqlSession但是查询条件不同
        Emp emp4 = mapper1.getEmpById(2);
        System.out.println("emp4: " + emp4);
    }
}
