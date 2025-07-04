package com.atguigu.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

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
     * InvocationHandler : 设置代理类中抽象方法如何重写
     *
     * @return
     */
    public Object getProxy() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler h = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    System.out.println("日志，方法: " + method.getName() + ", 参数: " + Arrays.toString(args));
                    // proxy: 代表代理对象，method代表要执行的方法，args表示要执行的方法的参数列表
                    result = method.invoke(target, args);
                    System.out.println("日志，方法: " + method.getName() + ", 结果: " + result);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("日志，方法: " + method.getName() + ", 异常: " + e);
                } finally {
                    System.out.println("日志，方法: " + method.getName() + ", 方法执行完毕");
                }
                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader, interfaces, h);
    }
}
