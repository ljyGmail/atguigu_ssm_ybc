package com.atguigu.spring.service.impl;

import com.atguigu.spring.dao.BookDao;
import com.atguigu.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: BookServiceImpl
 * Package: com.atguigu.spring.controller.service.impl
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 7. 1. 오후 11:25
 * @Version 1.0
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    // @Transactional(
            // readOnly = true, // 只读
            // timeout = 3, // 超时
            // noRollbackFor = ArithmeticException.class, // 回滚策略
            // noRollbackForClassName = "java.lang.ArithmeticException" // 回滚策略
            // isolation = Isolation.DEFAULT // 事务的隔离级别
            // propagation = Propagation.REQUIRES_NEW
    // )
    @Override
    public void buyBook(Integer userId, Integer bookId) {
        /*
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         */

        // 查询图书的价格
        Integer price = bookDao.getPriceByBookId(bookId);
        // 更新图书的库存
        bookDao.updateStock(bookId);
        // 更新用户的余额
        bookDao.updateBalance(userId, price);
        // System.out.println(1 / 0);
    }
}
