package com.toma.framework.lab02designpatternsprototypepattern;


import com.toma.framework.lab02designpatternsprototypepattern.base.BasePrototype;
import com.toma.framework.lab02designpatternsprototypepattern.base.LoadCache;

public class Lab02DesignPatternsPrototypePatternApplication {

    public static void main(String[] args) throws CloneNotSupportedException {
        LoadCache.loadCache();
        BasePrototype car = LoadCache.getPrototype("car");
        System.out.print("type:" + car.getType());
        System.out.println("|==|id:" + car.getId());

        BasePrototype house = LoadCache.getPrototype("house");
        System.out.print("type:" + house.getType());
        System.out.println("|==|id:" + house.getId());
    }

}
