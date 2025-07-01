package com.atguigu.spring.service;

/**
 * ClassName: BookService
 * Package: com.atguigu.spring.controller.service
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 7. 1. 오후 11:25
 * @Version 1.0
 */
public interface BookService {
    /**
     * 买书
     *
     * @param userId
     * @param bookId
     */
    void buyBook(Integer userId, Integer bookId);
}
