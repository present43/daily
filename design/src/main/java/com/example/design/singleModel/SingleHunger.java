package com.example.design.singleModel;

public class SingleHunger {

    private static final SingleHunger hunger = new SingleHunger();

    private final String name;
    private final String age;

    {
        this.name = "初始化名称";
        this.age = "初始化年龄";
        String mark = "其实感觉可以写成一个 固定的配置类 但是不够灵活";
    }


    private SingleHunger() {
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public SingleHunger getHunger() {
        return hunger;
    }
}
