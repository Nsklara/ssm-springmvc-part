package com.sh.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

/**
 * @Author: SH
 * @Date: 2023/12/27 16:56
 */

//参数校验
    /*
    name        不为空
    password    长度大于6
    age         必须>=1
    email       邮箱格式字符串
    birthday    必须是过去时间
     */
public class User {

    @NotBlank
    private String name;

    @Length(min = 6)
    private String password;

    @Min(1)
    private int age;

    @Email
    private String email;

    @Past
    private Date birthday;


    public User() {
    }

    public User(String name, String password, int age, String email, Date birthday) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.email = email;
        this.birthday = birthday;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     * @return birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String toString() {
        return "User{name = " + name + ", password = " + password + ", age = " + age + ", email = " + email + ", birthday = " + birthday + "}";
    }
}
