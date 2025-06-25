package com.atguigu.spring.controller;

import com.atguigu.spring.service.UserService;

/**
 * ClassName: UserController
 * Package: com.atguigu.spring.controller
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 25. 오전 9:38
 * @Version 1.0
 */
public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser(){
        userService.saveUser();
    }
}
