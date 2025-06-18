package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: SpecialSQLMapper
 * Package: com.atguigu.mybatis.mapper
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 18. 오전 11:53
 * @Version 1.0
 */
public interface SpecialSQLMapper {

    /**
     * 通过用户名模糊查询用户信息
     *
     * @param criteria
     * @return
     */
    List<User> getUserByLike(@Param("criteria") String criteria);
}
