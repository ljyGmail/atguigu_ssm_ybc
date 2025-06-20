package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.pojo.EmpExample;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * ClassName: MBGTest
 * Package: com.atguigu.mybatis.test
 * Description:
 *
 * @Author ljy
 * @Create 2025-06-20 오후 4:27
 * @Version 1.0
 */
public class MBGTest {

    @Test
    public void testMBG() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        // 根据id查询数据
        /*
        Emp emp = mapper.selectByPrimaryKey(1);
        System.out.println("emp: " + emp);
         */
        // 查询所有数据
        /*
        List<Emp> list = mapper.selectByExample(null);
        list.forEach(System.out::println);
         */
        // 根据条件查询数据
        /*
        EmpExample example = new EmpExample();
        example.createCriteria().andEmpNameEqualTo("张三").andAgeGreaterThanOrEqualTo(20);
        example.or().andGenderEqualTo("男");
        List<Emp> list = mapper.selectByExample(example);
        list.forEach(System.out::println);
         */
        Emp emp = new Emp(1, "zhang-san", null, "男");
        // 测试普通修改功能
        // mapper.updateByPrimaryKey(emp);

        // 测试选择性修改
        mapper.updateByPrimaryKeySelective(emp);
    }
}
