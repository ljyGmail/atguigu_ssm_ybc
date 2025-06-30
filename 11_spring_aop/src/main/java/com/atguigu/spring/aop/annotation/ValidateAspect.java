package com.atguigu.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * ClassName: ValidateAspect
 * Package: com.atguigu.spring.aop.annotation
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 30. 오전 10:43
 * @Version 1.0
 */
@Component
@Aspect
@Order(1)
public class ValidateAspect {

    // @Before("execution(* com.atguigu.spring.aop.annotation.CalculatorImpl.*(..))")
    // 使用在其他类中定义的切入点表达式
    @Before("com.atguigu.spring.aop.annotation.LoggerAspect.pointCut()")
    public void beforeMethod() {
        System.out.println("ValidateAspect-->前置通知");
    }
}
