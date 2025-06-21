package com.atguigu.spring.pojo;

/**
 * ClassName: Student
 * Package: com.atguigu.spring.pojo
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 21. 오전 11:57
 * @Version 1.0
 */
public class Student {

    private Integer sid;
    private String sname;
    private Integer age;
    private String gender;

    // Spring容器创建对象时必须要有无参构造器
    public Student() {
    }

    public Student(Integer sid, String sname, Integer age, String gender) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
