package com.example.demo2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reader")
public class reader {

    public reader(){

    }
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String username;
    private String pwd;

    public reader(String name ,int age,String pwd, String username) {
        this.name = name;
        this.age = age;
        this.pwd = pwd;
        this.username = username;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getuser() {
        return username;
    }

    public void setuser(String username) {
        this.username = username;
    }

    public String getpwd() {
        return pwd;
    }

    public void setpwd(String pwd) {
        this.pwd = pwd;
    }
}
