package com.atguigu.spring.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * ClassName: LoggerAspect
 * Package: com.atguigu.spring.aop.annotation
 * Description:
 * 在切面中，需要通过指定的注解将方法标识为通知方法
 * <p>
 * 1. @Before: 前置通知，在目标对象方法执行之前执行
 * <p>
 * 2. 切入点表达式: 设置在标识通知的注解的value属性中
 * execution(public int com.atguigu.spring.aop.annotation.CalculatorImpl.add(int, int))
 * execution(* com.atguigu.spring.aop.annotation.CalculatorImpl.*(..))
 * 第一个* 表示任意的访问修饰符和返回值类型
 * 第二个* 表示类中的任意方法
 * .. 表示任意的参数
 * 类的地方也可以使用*，表示包下所有的类
 * <p>
 * 3. 重用切入点表达书
 * <p>
 * // 声明一个公共的切入点表达式
 *
 * @Pointcut("execution(* com.atguigu.spring.aop.annotation.CalculatorImpl.*(..))")
 * public void pointCut() {
 * }
 * <p>
 * 使用方式: @Before("pointCut()")
 *
 * <p>
 * 4. 获取连接点的信息
 * 在通知方法的参数位置，设置JoinPoint联系的参数，就可以获取连接点所对应方法的信息
 * // 获取连接点所对应方法的签名信息
 * Signature signature = joinPoint.getSignature();
 * // 获取连接点所对应方法的参数
 * Object[] args = joinPoint.getArgs();
 * @Author: ljy
 * @Create: 2025. 6. 28. 오후 3:19
 * @Version 1.0
 */
@Component
@Aspect // 将当前组件标识为切面
public class LoggerAspect {

    @Pointcut("execution(* com.atguigu.spring.aop.annotation.CalculatorImpl.*(..))")
    public void pointCut() {
    }

    // @Before("execution(public int com.atguigu.spring.aop.annotation.CalculatorImpl.add(int, int))")
    // @Before("execution(* com.atguigu.spring.aop.annotation.*.*(..))")
    @Before("pointCut()")
    public void beforeAdviceMethod(JoinPoint joinPoint) {
        // 获取连接点所对应方法的签名信息
        Signature signature = joinPoint.getSignature();
        // 获取连接点所对应方法的参数
        Object[] args = joinPoint.getArgs();
        System.out.println("LoggerAspect, 方法: " + signature.getName() + ", 参数: " + Arrays.toString(args));
    }

    @After("pointCut()")
    public void afterAdviceMethod(JoinPoint joinPoint) {
        System.out.println("后置通知");
    }
}
