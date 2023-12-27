package com.sh.entity;

/**
 * @Author: SH
 * @Date: 2023/12/24 21:19
 */
public class User {
    private int id;
    private String name;
    private int age;
    
    
    public User() {
    }
    
    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }
    
    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
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
        return "User{id = " + id + ", name = " + name + ", age = " + age + "}";
    }
}
