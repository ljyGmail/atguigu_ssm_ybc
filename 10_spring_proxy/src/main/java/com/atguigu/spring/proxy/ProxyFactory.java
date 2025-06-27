package com.atguigu.spring.proxy;

import java.lang.reflect.Proxy;

/**
 * ClassName: ProxyFactory
 * Package: com.atguigu.spring.proxy
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 27. 오후 11:32
 * @Version 1.0
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * ClassLoader loader: 指定加载动态生成的代理类的类加载器
     * Class[] interfaces: 获取目标对象实现的所有接口的Class对象的数组
     * InvocationHandler :
     *
     * @return
     */
    public Object getProxy() {

        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader, interfaces, null);
    }
}
