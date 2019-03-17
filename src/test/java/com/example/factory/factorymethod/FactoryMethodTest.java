package com.example.factory.factorymethod;

import com.example.factory.MengNiuMilk;

public class FactoryMethodTest {

    public static void main(String[] args) {
        MengNiuMilkFactory mengNiuMilkFactory = new MengNiuMilkFactory();
        MengNiuMilk mengNiuMilk = (MengNiuMilk) mengNiuMilkFactory.create();
        mengNiuMilk.create();
    }
}
