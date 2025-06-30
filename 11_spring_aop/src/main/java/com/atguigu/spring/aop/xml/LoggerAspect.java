package com.atguigu.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * ClassName: LoggerAspect
 * Package: com.atguigu.spring.aop.annotation
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 28. 오후 3:19
 * @Version 1.0
 */
@Component
public class LoggerAspect {

    public void beforeAdviceMethod(JoinPoint joinPoint) {
        // 获取连接点所对应方法的签名信息
        Signature signature = joinPoint.getSignature();
        // 获取连接点所对应方法的参数
        Object[] args = joinPoint.getArgs();
        System.out.println("LoggerAspect, 方法: " + signature.getName() + ", 参数: " + Arrays.toString(args));
    }

    public void afterAdviceMethod(JoinPoint joinPoint) {
        // 获取连接点所对应方法的签名信息
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect, 方法: " + signature.getName() + ", 执行完毕");
    }

    public void afterReturningAdviceMethod(JoinPoint joinPoint, Object result) {
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect, 方法: " + signature.getName() + ", 结果: " + result);
    }

    public void afterThrowingAdviceMethod(JoinPoint joinPoint, Throwable ex) {
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect, 方法: " + signature.getName() + ", 异常: " + ex);
    }

    public Object aroundAdviceMethod(ProceedingJoinPoint proceedingJoinPoint) {
        Object result = null;
        try {
            System.out.println("环绕通知 --> 前置通知");
            // 表示目标对象方法的执行
            result = proceedingJoinPoint.proceed();
            System.out.println("环绕通知 --> 返回通知");
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("环绕通知 --> 异常通知");
        } finally {
            System.out.println("环绕通知 --> 后置通知");
        }
        return result;
    }
}
