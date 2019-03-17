package com.example.factory.abstractfactory;

import com.example.factory.MilkCreate;

public interface MilkFactory {

    MilkUse create();

     MilkDrink drink();

     MilkCreate use();
}
