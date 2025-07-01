package com.atguigu.spring.dao;

/**
 * ClassName: BookDao
 * Package: com.atguigu.spring.dao
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 7. 1. 오후 11:26
 * @Version 1.0
 */
public interface BookDao {
    /**
     * 根据图书的id查询图书的价格
     *
     * @param bookId
     * @return
     */
    Integer getPriceByBookId(Integer bookId);

    /**
     * 更新图书的库存
     *
     * @param bookId
     */
    void updateStock(Integer bookId);

    /**
     * 更新用户的余额
     *
     * @param userId
     * @param price
     */
    void updateBalance(Integer userId, Integer price);
}
