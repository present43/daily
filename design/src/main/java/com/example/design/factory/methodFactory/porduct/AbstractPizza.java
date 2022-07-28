package com.example.design.factory.methodFactory.porduct;

/**
 * 抽象产品类
 */
public abstract class AbstractPizza {

    public String name;
    // 定义对应的产品步骤  -- 其实这里可以写成接口
    // 区别是 除了标准外 还想让子类 继承一些公用的属性

    // 共性方法抽取
    public abstract void cut();

    public abstract void bake();


}
