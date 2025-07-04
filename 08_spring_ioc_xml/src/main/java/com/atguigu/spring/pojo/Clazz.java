package com.atguigu.spring.pojo;

import java.util.List;

/**
 * ClassName: Clazz
 * Package: com.atguigu.spring.pojo
 * Description:
 *
 * @Author ljy
 * @Create 2025-06-23 오전 8:24
 * @Version 1.0
 */
public class Clazz {

    private Integer cid;
    private String cname;
    private List<Student> students;

    public Clazz() {
    }

    public Clazz(Integer cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", students=" + students +
                '}';
    }
}
