package com.example.design.factory.simpleFactory;

import lombok.Data;

@Data
public class SHPizz extends FactoryPizz {

    private String taste;

    private String size;

    public void method() {
        System.out.println("执行 BjPizz 特有的方法");
    }


}
