package com.example.demo.polymorphic;
import lombok.Data;

//@Data
public interface Animal {
//    private String name;
//    private String age;

//    public void eat() {
//        System.out.println("动物需要进食");
//    }

//    public void sleep() {
//        System.out.println("动物需要休息");
//    }

    public void eat();

    public void sleep();

}
