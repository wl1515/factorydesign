package com.example.factory.factorymethod;

import com.example.factory.MengNiuMilk;
import com.example.factory.MilkCreate;

public class MengNiuMilkFactory implements MilkFactory{

    @Override
    public MilkCreate create() {
        return new MengNiuMilk();
    }
}
