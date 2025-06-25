package com.atguigu.spring.service.impl;

import com.atguigu.spring.dao.UserDao;
import com.atguigu.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserServiceImpl
 * Package: com.atguigu.spring.service
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 25. 오후 3:05
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    // @Autowired
    private UserDao userDao;

    /*
    @Autowired
    public void setUserDao(UserDao userDao) {
        System.out.println("UserServiceImpl -- setter invoked! ");
        this.userDao = userDao;
    }
     */

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        System.out.println("UserServiceImpl constructor invoked!");
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
