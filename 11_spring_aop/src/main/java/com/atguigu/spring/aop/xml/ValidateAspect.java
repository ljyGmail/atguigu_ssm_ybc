package com.atguigu.spring.aop.xml;

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
public class ValidateAspect {

    public void beforeMethod() {
        System.out.println("ValidateAspect-->前置通知");
    }
}
