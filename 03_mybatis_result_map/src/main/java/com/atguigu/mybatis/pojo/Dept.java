package com.atguigu.mybatis.pojo;

import java.util.List;

/**
 * ClassName: Dept
 * Package: com.atguigu.mybatis.pojo
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 18. 오후 4:06
 * @Version 1.0
 */
public class Dept {
    private Integer deptId;
    private String deptName;
    private List<Emp> emps;

    public Dept() {
    }

    public Dept(Integer deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", emps=" + emps +
                '}';
    }
}
