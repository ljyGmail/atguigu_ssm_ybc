package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
        Page<Object> page = PageHelper.startPage(4, 4);
        List<Emp> list = mapper.selectByExample(null);
        // 查询之后可以获取分页相关的所有数据
        PageInfo<Emp> pageInfo = new PageInfo<>(list, 5);
        list.forEach(System.out::println);
        System.out.println("page: " + page);
        // PageInfo{
        // pageNum=4,
        // pageSize=4,
        // size=4,
        // startRow=13,
        // endRow=16,
        // total=30,
        // pages=8,
        // list=Page{count=true, pageNum=4, pageSize=4, startRow=12, endRow=16, total=30, pages=8, reasonable=false, pageSizeZero=false}
        //    [Emp{empId=13, empName='aaa', age=null, gender='null', deptId=null}, Emp{empId=14, empName='aaa', age=null, gender='null', deptId=null}, Emp{empId=15, empName='aaa', age=null, gender='null', deptId=null}, Emp{empId=16, empName='aaa', age=null, gender='null', deptId=null}],
        // prePage=3,
        // nextPage=5,
        // isFirstPage=false,
        // isLastPage=false,
        // hasPreviousPage=true,
        // hasNextPage=true,
        // navigatePages=5,
        // navigateFirstPage=2,
        // navigateLastPage=6,
        // navigatepageNums=[2, 3, 4, 5, 6]}
        System.out.println("pageInfo: " + pageInfo);
    }
}
