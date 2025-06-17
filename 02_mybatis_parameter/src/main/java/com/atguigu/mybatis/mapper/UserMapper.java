package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.Map;

/**
 * ClassName: UserMapper
 * Package: org.atguigu.mybatis.mapper
 * Description:
 * MyBatis获取参数值的两种方式: #{}和${}
 * #{}的本质是占位符赋值，${}的本质是字符串拼接。
 * 1. 若mapper接口方法的参数为单个的字面量类型
 * 此时可以通过#{}或${}以任意的内容获取参数值，一定要注意${}的单引号问题。
 * 2. 若mapper接口方法的参数为多个的字面量类型
 * 此时MyBatis会讲参数放在map集合中，以两种方式存储数据
 * a> 以arg0，arg1...为键，以参数为值
 * b> 以param1，param2...为键，以参数为值
 * 因此，只需要通过#{}或${}访问map集合中的键，就可以获取相应的值
 * 3. 若mapper接口方法的参数为map集合类型的参数
 * 只需要通过#{}或${}访问map集合中的键，就可以获取相应的值
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

    /**
     * 验证登录
     *
     * @param username
     * @param password
     * @return
     */
    User checkLogin(String username, String password);

    /**
     * 验证登录(以map集合作为参数)
     *
     * @param map
     * @return
     */
    User checkLoginByMap(Map<String, Object> map);
}
