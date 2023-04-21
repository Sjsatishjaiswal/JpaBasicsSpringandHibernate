package com.example.JpaBasicsHibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.lang.*;

@Entity// to make table this class by Annotations

@Table(name="user_info") // Table name is user_info; it's not mandatory this is optional!

public class User { // "User error" show that it's Need to make Primary key in table
    @Id       // this tell springBoot framework this is  field tell become primary key
    private int userId;
  //@Column()
    private  String name;
    private  int age;
    private String mobile;
 // Good practices to make 2 Constructors
    //1) No Parameter ,2) All parameter

    // Alt+Insert(To make Constructors in Window


    public User() {
        // Spring use this to make beans
    }

    public User(String name, int age, String mobile) {
        this.name = name;
        this.age = age;
        this.mobile = mobile;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
