package com.example.design.factory.methodFactory;

import com.example.design.factory.enu.PizzType;
import com.example.design.factory.methodFactory.porduct.AbstractPizza;
import com.example.design.factory.methodFactory.porduct.BjPizza;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 抽象工厂的具体实现
 */
@Data
@Slf4j
public class BjPizzaFactory extends AbstractFactory {

    private String taste;

    private String size;


    /**
     * 生成具体对象
     * 可以生成更多的个性化子类
     */
    @Override
    public AbstractPizza createProduct(PizzType type) {

        if ("".equals(type.getName())) {
            // 个性化子类 1
            log.info("占位");
        }
        if ("BJ".equals(type.getName())) {
            // 个性化子类 2
            // 这里我就写 个性化子类的父类了
            return new BjPizza();
        }

        return null;
    }


}
