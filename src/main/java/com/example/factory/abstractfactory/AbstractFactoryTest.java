package com.example.factory.abstractfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        MilkFactory milkFactory = new MengNiuMilkFactory();
        milkFactory.create();
        milkFactory.drink();
        milkFactory.use();
    }
}
