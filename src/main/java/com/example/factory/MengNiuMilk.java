package com.example.factory;

public class MengNiuMilk implements MilkCreate {
    @Override
    public void create() {
        System.out.println("生产蒙牛牛奶");
    }
}
