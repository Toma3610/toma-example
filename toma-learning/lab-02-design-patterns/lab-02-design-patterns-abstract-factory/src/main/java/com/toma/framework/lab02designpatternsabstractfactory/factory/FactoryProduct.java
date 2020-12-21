package com.toma.framework.lab02designpatternsabstractfactory.factory;

import com.toma.framework.lab02designpatternsabstractfactory.factory.car.CarFactory;
import com.toma.framework.lab02designpatternsabstractfactory.factory.color.ColorFactory;

import java.util.Objects;

/**
 * 统一产品工厂类
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/20
 */
public class FactoryProduct {
    /**
     * 根据产品类型获取工厂
     * @param productType 产品类型
     * @return 工厂
     */
    public static AbstractFactory getProduct(String productType){
        if (Objects.equals(productType,AbstractFactory.CAR)){
            return new CarFactory();
        } else if (Objects.equals(productType,AbstractFactory.COLOR)){
            return new ColorFactory();
        }
        throw  new RuntimeException("未找到相关产品");
    }
}
