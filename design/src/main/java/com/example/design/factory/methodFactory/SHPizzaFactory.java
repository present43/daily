package com.example.design.factory.methodFactory;

import com.example.design.factory.enu.PizzType;
import com.example.design.factory.methodFactory.porduct.AbstractPizza;
import com.example.design.factory.methodFactory.porduct.BjPizza;
import com.example.design.factory.methodFactory.porduct.SHPizza;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 抽象工厂的具体实现
 */
@Data
@Slf4j
public class SHPizzaFactory extends AbstractFactory{

    private String taste;

    private String size;


    @Override
    public AbstractPizza createProduct(PizzType type) {

        if ("".equals(type.getName())) {
            // 个性化子类 1
            log.info("占位 ---");
        }
        if ("SH".equals(type.getName())) {
            // 个性化子类 2
            // 这里我就写 个性化子类的父类了
            return new SHPizza();
        }
        return null;
    }
}
