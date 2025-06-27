package com.atguigu.spring.test;

import com.atguigu.spring.proxy.Calculator;
import com.atguigu.spring.proxy.CalculatorImpl;
import com.atguigu.spring.proxy.CalculatorStaticProxy;
import com.atguigu.spring.proxy.ProxyFactory;
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
    public void testStaticProxy() {
        CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorImpl());
        proxy.add(1, 2);
    }

    /**
     * 动态代理有两种:
     * 1. jdk动态代理: 要求必须有接口，最终生成的代理类和目标类实现相同的接口，在jdk.proxy2包下，类名为$Proxy{数字}。
     * 2. cglib动态代理，最终生成的代理类会继承目标类，并且和目标类在相同的包下。
     */
    @Test
    public void testDynamicProxy() {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        System.out.println(proxy.getClass().getName());
        proxy.add(1, 2);
        proxy.sub(1, 2);
        proxy.mul(1, 2);
        proxy.div(1, 0);
    }
}
