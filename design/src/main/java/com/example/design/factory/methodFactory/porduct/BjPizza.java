package com.example.design.factory.methodFactory.porduct;

import org.springframework.stereotype.Service;

@Service
public class BjPizza extends AbstractPizza{


    @Override
    public void cut() {
        System.out.println("BjPizza cut ....");
    }

    @Override
    public void bake() {
        System.out.println("BjPizza bake ....");
    }


}
