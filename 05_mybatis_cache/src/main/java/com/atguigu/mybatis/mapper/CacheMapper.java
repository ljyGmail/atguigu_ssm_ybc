package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName: EmpMapper
 * Package: com.atguigu.mybatis.mapper
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 20. 오전 11:09
 * @Version 1.0
 */
public interface CacheMapper {

    /**
     * 根据员工id查询有关信息
     *
     * @param empId
     * @return
     */
    Emp getEmpById(@Param("empId") Integer empId);

    /**
     * 添加员工信息
     *
     * @param emp
     */
    void insertEmp(Emp emp);
}
