package com.example.design.factory.simpleFactory;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class BjPizz  extends FactoryPizz {

    private String taste;

    private String size;


    public void method() {
        // 睡 50毫秒
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            log.info("BjPizz method",e);
            e.printStackTrace();
        }
        System.out.println("执行 BjPizz 特有的方法");
    }

}
