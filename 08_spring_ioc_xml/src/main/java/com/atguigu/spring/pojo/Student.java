package com.atguigu.spring.pojo;

import java.util.Arrays;

/**
 * ClassName: Student
 * Package: com.atguigu.spring.pojo
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 21. 오전 11:57
 * @Version 1.0
 */
public class Student implements Person {

    private Integer sid;
    private String sname;
    private Integer age;
    private String gender;
    private Double score;
    private Clazz clazz;
    private String[] hobbies;

    // Spring容器创建对象时必须要有无参构造器
    public Student() {
    }

    public Student(Integer sid, String sname, String gender, Integer age) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
    }

    public Student(Integer sid, String sname, String gender, Double score) {
        this.sid = sid;
        this.sname = sname;
        this.gender = gender;
        this.score = score;
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

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", sid=" + sid +
                ", sname='" + sname + '\'' +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                ", clazz=" + clazz +
                ", hobbies=" + Arrays.toString(hobbies) +
                '}';
    }
}
