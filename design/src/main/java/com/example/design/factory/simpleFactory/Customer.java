package com.example.design.factory.simpleFactory;


public class Customer {

    private String name;
    private String age;
    private String hobby;


    // 消费者的消费方法
    public void eatPizz() {

        // 简单工厂模式 交由工厂去创建对象
        Pizz pizz = Pizz.getPizz(PizzType.BJ_PIZZ);
        if (pizz != null) {
            pizz.time();
        }
    }

}
