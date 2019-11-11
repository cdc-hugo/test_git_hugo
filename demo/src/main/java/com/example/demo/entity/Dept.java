package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.Objects;

public class Dept {

    private Integer deptno;
    private String dname;
    private String loc;

    @JsonFormat()
    private Date date;

    public Dept() {
    }

    public Dept(Integer deptno, String dname, String loc, Date date) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dept dept = (Dept) o;
        return Objects.equals(deptno, dept.deptno) &&
                Objects.equals(dname, dept.dname) &&
                Objects.equals(loc, dept.loc) &&
                Objects.equals(date, dept.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptno, dname, loc, date);
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
