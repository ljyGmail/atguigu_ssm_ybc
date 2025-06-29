package com.atguigu.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * ClassName: LoggerAspect
 * Package: com.atguigu.spring.aop.annotation
 * Description:
 * 在切面中，需要通过指定的注解将方法标识为通知方法
 *
 * @Before: 前置通知，在目标对象方法执行之前执行
 * @Author: ljy
 * @Create: 2025. 6. 28. 오후 3:19
 * @Version 1.0
 */
@Component
@Aspect // 将当前组件标识为切面
public class LoggerAspect {

    @Before("execution(public int com.atguigu.spring.aop.annotation.CalculatorImpl.add(int, int))")
    public void beforeAdviceMethod() {
        System.out.println("LoggerAspect, 前置通知");
    }
}
