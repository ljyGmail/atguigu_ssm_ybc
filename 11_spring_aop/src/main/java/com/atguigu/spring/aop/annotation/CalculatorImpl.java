package com.atguigu.spring.aop.annotation;

import org.springframework.stereotype.Component;

/**
 * ClassName: CalculatorImpl
 * Package: com.atguigu.spring.aop.annotation
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 27. 오후 6:10
 * @Version 1.0
 */
@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        int result = 1 + j;
        System.out.println("方法内部: result: " + result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = 1 - j;
        System.out.println("方法内部: result: " + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = 1 * j;
        System.out.println("方法内部: result: " + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = 1 / j;
        System.out.println("方法内部: result: " + result);
        return result;
    }
}
