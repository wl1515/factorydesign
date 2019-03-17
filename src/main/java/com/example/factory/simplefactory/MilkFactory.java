package com.example.factory.simplefactory;

import com.example.factory.MilkCreate;

public class MilkFactory {

/*    public Milk getMilk(String type){
        if("YiLi".equals(type)){
            return new YiLiMilk();
        }else{
            return null;
        }
    }*/

    //传入类名
/*    public Milk getMilk(String className){
        try {
            if(className !=null && !"".equals(className)){
                return (Milk) Class.forName(className).newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }*/

    //传入类
    public MilkCreate getMilk(Class clazz){
        try {
            if(null != clazz){
                return (MilkCreate) clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
