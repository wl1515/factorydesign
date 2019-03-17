package com.example.factory.factorymethod;

import com.example.factory.MilkCreate;
import com.example.factory.YiLiMilk;

public class YiLiMilkFactory implements MilkFactory{
    @Override
    public MilkCreate create() {
        return new YiLiMilk();
    }
}
