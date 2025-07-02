package com.atguigu.spring.service;

/**
 * ClassName: CheckoutService
 * Package: com.atguigu.spring.service
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 7. 2. 오후 12:04
 * @Version 1.0
 */
public interface CheckoutService {
    /**
     * 结账
     *
     * @param userId
     * @param bookIds
     */
    void checkout(Integer userId, Integer[] bookIds);
}
