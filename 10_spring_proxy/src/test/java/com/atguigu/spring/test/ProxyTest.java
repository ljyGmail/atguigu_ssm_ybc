package com.atguigu.spring.test;

import com.atguigu.spring.proxy.CalculatorImpl;
import com.atguigu.spring.proxy.CalculatorStaticProxy;
import org.junit.Test;

/**
 * ClassName: ProxyTest
 * Package: com.atguigu.spring.test
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 27. 오후 7:40
 * @Version 1.0
 */
public class ProxyTest {

    @Test
    public void testProxy() {
        CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorImpl());
        proxy.add(1, 2);
    }
}
