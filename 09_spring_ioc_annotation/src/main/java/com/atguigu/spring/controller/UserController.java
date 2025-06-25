package com.atguigu.spring.controller;

import com.atguigu.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * ClassName: UserController
 * Package: com.atguigu.spring.controller
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 25. 오후 3:03
 * @Version 1.0
 */
// @Controller("myController")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void saveUser() {
        userService.saveUser();
    }
}
