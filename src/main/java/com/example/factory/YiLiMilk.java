package com.example.factory;

import com.example.factory.MilkCreate;

public class YiLiMilk implements MilkCreate {
    @Override
    public void create() {
        System.out.println("生产伊利牛奶");
    }
}
