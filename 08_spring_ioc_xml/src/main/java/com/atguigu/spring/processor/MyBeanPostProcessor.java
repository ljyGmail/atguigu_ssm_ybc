package com.atguigu.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * ClassName: MyBeanPostProcessor
 * Package: com.atguigu.spring.process
 * Description:
 *
 * @Author ljy
 * @Create 2025-06-24 오후 12:14
 * @Version 1.0
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    // 此方法在bean的生命周期初始化之前执行
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor-->后置处理器postProcessBeforeInitialization");
        return bean;
    }

    // 此方法在bean的生命周期初始化之后执行
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor-->后置处理器postProcessAfterInitialization");
        return bean;
    }
}
