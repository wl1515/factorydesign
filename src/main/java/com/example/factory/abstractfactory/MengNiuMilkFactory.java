package com.example.factory.abstractfactory;

import com.example.factory.MengNiuMilk;
import com.example.factory.MilkCreate;

public class MengNiuMilkFactory implements MilkFactory{
    @Override
    public MilkUse create() {
       return  new  MengNiuMilkUse();
    }

    @Override
    public MilkDrink drink() {
        return new MengNiuMilkDrink();
    }

    @Override
    public MilkCreate use() {
        return new MengNiuMilk();
    }
}
