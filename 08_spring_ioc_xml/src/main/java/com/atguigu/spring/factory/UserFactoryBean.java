package com.atguigu.spring.factory;

import com.atguigu.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * ClassName: UserFactoryBean
 * Package: com.atguigu.spring.factory
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 25. 오전 9:52
 * @Version 1.0
 */
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
