package com.example.design.factory.simpleFactory;

import lombok.Data;

/**
 *  简单工厂模式 --- 用于生产对象
 */
@Data
public class Pizz {

    private String colour;

    // 壳子 用于子类重写
    public void method() { }


    public void  time() {
        // 公有步骤  比如我这里计算方法的执行时间
        long startTime = System.currentTimeMillis();
        method();
        long endTime = System.currentTimeMillis();
        System.out.println(startTime-endTime);

    }

    public static Pizz getPizz(PizzType type) {
        if ("BJ".equals(type.getName())) {
            return new BjPizz();
        }
        if ("SH".equals(type.getName())) {
            return new SHPizz();
        }
        return null;
    }

}
