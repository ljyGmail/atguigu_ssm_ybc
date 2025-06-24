package com.atguigu.spring.pojo;

/**
 * ClassName: User
 * Package: com.atguigu.spring.pojo
 * Description:
 *
 * @Author ljy
 * @Create 2025-06-24 오전 11:57
 * @Version 1.0
 */
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;

    public User() {
        System.out.println("生命周期1: 实例化");
    }

    public User(Integer age, Integer id, String password, String username) {
        this.age = age;
        this.id = id;
        this.password = password;
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        System.out.println("生命周期2: 依赖注入");
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void initMethod() {
        System.out.println("生命周期3: 初始化");
    }

    public void destroyMethod() {
        System.out.println("生命周期4: 销毁");
    }
}
