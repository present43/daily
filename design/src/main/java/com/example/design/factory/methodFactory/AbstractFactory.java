package com.example.design.factory.methodFactory;

import com.example.design.factory.enu.PizzType;
import com.example.design.factory.methodFactory.porduct.AbstractPizza;

/**
 * 工厂方法其实就是对之前简单工厂模式中的工厂类进行抽象
 * 相对于又 简单模式 多抽了一层 在使用的时候 依赖于抽象 后期就会更好的维护
 */
public abstract class AbstractFactory {

    // 创建对应对象的方法 返回的也是抽象的产品
   public abstract AbstractPizza createProduct(PizzType type);

    // 做一些 通用操作


}
