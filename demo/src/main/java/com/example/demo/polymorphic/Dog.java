package com.example.demo.polymorphic;

/**
 * 子类 狗
 */
public class Dog implements Animal{
    private String name;
    private String age;

    public void eat(){
        System.out.println("狗子吃骨头");
    }

    @Override
    public void sleep() {
        System.out.println("狗子睡狗窝");
    }

    public void active() {
        System.out.println("狗子会拆家");
    }

    public Dog(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
