package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

/**
 * ClassName: UserMapper
 * Package: org.atguigu.mybatis.mapper
 * Description:
 * MyBatis获取参数值的两种方式: #{}和${}
 * #{}的本质是占位符赋值，${}的本质是字符串拼接。
 * 1. 若mapper接口方法的参数为单个的字面量类型
 * 此时可以通过#{}或${}以任意的内容获取参数值，一定要注意${}的单引号问题。
 *
 * @Author: ljy
 * @Create: 2025. 6. 17. 오후 3:27
 * @Version 1.0
 */
public interface UserMapper {

    /**
     * 根据用户名查询用户信息
     *
     * @param username
     * @return
     */
    User getUserByUsername(String username);
}
