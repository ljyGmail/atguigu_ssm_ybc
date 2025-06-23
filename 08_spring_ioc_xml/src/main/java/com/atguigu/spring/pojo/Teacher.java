package com.atguigu.spring.pojo;

/**
 * ClassName: Teacher
 * Package: com.atguigu.spring.pojo
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 23. 오전 9:27
 * @Version 1.0
 */
public class Teacher {
    private Integer tid;
    private String tname;

    public Teacher() {
    }

    public Teacher(Integer tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                '}';
    }
}
