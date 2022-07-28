package com.example.design.factory.simpleFactory;

import com.example.design.factory.enu.PizzType;
import lombok.Data;

/**
 *  简单工厂模式 --- 用于生产对象
 */
@Data
public class FactoryPizz {

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


    // 这个是简单工厂模式下面的 创建对象的方法
    // 缺点 1. 需要消费者传参数去确定 对应实现  2.没多一个子类就要多写一个 if 判断
    public static FactoryPizz getPizz(PizzType type) {
        if ("BJ".equals(type.getName())) {
            return new BjPizz();
        }
        if ("SH".equals(type.getName())) {
            return new SHPizz();
        }
        return null;
    }

}
