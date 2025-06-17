package org.atguigu.mybatis.mapper;

import org.atguigu.mybatis.pojo.User;

/**
 * ClassName: UserMapper
 * Package: org.atguigu.mybatis.mapper
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 17. 오후 3:27
 * @Version 1.0
 */
public interface UserMapper {

    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    User getUserByUsername(String username);
}
