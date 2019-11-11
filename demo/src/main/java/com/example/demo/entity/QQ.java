package com.example.demo.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Objects;

public class QQ {
    @NotNull(message = "输入为空")
    @Pattern(regexp = "\\w{4,10}",message = "请输入4到40到位的字符")
    private String nick;
    private String pwd;
    private String phone;
    private String email;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public QQ(String nick, String pwd, String phone, String email) {
        this.nick = nick;
        this.pwd = pwd;
        this.phone = phone;
        this.email = email;
    }

    public QQ() {
    }

    @Override
    public String toString() {
        return "QQ{" +
                "nick='" + nick + '\'' +
                ", pwd='" + pwd + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QQ qq = (QQ) o;
        return Objects.equals(nick, qq.nick) &&
                Objects.equals(pwd, qq.pwd) &&
                Objects.equals(phone, qq.phone) &&
                Objects.equals(email, qq.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick, pwd, phone, email);
    }
}
