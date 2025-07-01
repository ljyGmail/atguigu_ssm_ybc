package com.atguigu.spring.controller;

import com.atguigu.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * ClassName: BookController
 * Package: com.atguigu.spring.controller
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 7. 1. 오후 11:24
 * @Version 1.0
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    public void buyBook(Integer userId, Integer bookId) {
        bookService.buyBook(userId, bookId);
    }
}
