package com.example.demo.polymorphic;

/**
 * 子类 猫
 */
public class Cat implements Animal{
    private String name;
    private String age;

    public Cat(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("猫吃菜叶 ");
    }

    @Override
    public void sleep() {

    }
}
