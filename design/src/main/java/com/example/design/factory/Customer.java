package com.example.design.factory;


import com.example.design.factory.methodFactory.AbstractFactory;
import com.example.design.factory.methodFactory.BjPizzaFactory;
import com.example.design.factory.methodFactory.porduct.AbstractPizza;
import com.example.design.factory.simpleFactory.FactoryPizz;
import com.example.design.factory.enu.PizzType;

/**
 * 工厂模式消费者
 */
public class Customer {

    private String name;
    private String age;
    private String hobby;


    // 消费者的消费方法
    public void eatPizz() {

        // 简单工厂模式 交由工厂去创建对象
//        FactoryPizz pizz = FactoryPizz.getPizz(PizzType.BJ_PIZZ);
//        if (pizz != null) {
//            pizz.time();
//        }

        // 工厂方法模式 将创建对象的职责下发到其子类
        // 工厂发放是通过调用不同对象的方法 去创建对象的，所有说是 工厂方法
        AbstractFactory factory = new BjPizzaFactory();

        // 用抽象产品类去接 但运行后就是具体的产品类了
        AbstractPizza product = factory.createProduct(PizzType.BJ_PIZZ);
        product.cut();


    }

}
