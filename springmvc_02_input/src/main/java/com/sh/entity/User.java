package com.sh.entity;

/**
 * @Author: SH
 * @Date: 2023/12/13 16:56
 */
public class User {
    //param使用实体类接收数据
    //属性名必须等于形参名
    //如果有默认值直接设置
    private String name;
    private int age = 10;
    
    public User() {
    }
    
    public User(String name, int age) {
        this.name = name;
        this.age = age;
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
    
    public String toString() {
        return "User{name = " + name + ", age = " + age + "}";
    }
}
