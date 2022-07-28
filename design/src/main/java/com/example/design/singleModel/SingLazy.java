package com.example.design.singleModel;

/**
 * 简单的单例模式
 */
public class SingLazy {
    /**
     * 单例模式实现步骤
     * 1.私有化构造器
     * 2.设置私有静态属性 给其赋予 对象地址
     * 3.对外暴露一个方法，提供此静态属性
     */

    // 私有的静态属性 全类共享
    private static SingLazy poj = null;

    // 象征性的给两个属性
    private String name;
    private String age;

    // 给个有参构造 初始化属性值
    private SingLazy() {}

    // 只给属性的 get 方法, 不给set方法


    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    // 懒汉模式
    public SingLazy getPoj() {
        if (poj == null) {
            poj = new SingLazy();
        }
        return poj;
    }

}
