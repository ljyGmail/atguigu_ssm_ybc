package com.atguigu.spring.dao.impl;

import com.atguigu.spring.dao.UserDao;

/**
 * ClassName: UserDaoImpl
 * Package: com.atguigu.spring.dao.impl
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 25. 오전 9:39
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
