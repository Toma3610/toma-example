package com.toma.framework.lab02designpatternsabstractfactory.factory.car;

import com.toma.framework.lab02designpatternsabstractfactory.factory.AbstractFactory;
import com.toma.framework.lab02designpatternsabstractfactory.factory.car.AudiCar;
import com.toma.framework.lab02designpatternsabstractfactory.factory.car.BmwCar;
import com.toma.framework.lab02designpatternsabstractfactory.factory.car.Car;
import com.toma.framework.lab02designpatternsabstractfactory.factory.color.CarColor;

import java.util.Objects;

/**
 * 汽车工厂类
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/20
 */
public class CarFactory extends AbstractFactory {
    /**
     * 根据汽车品牌生产对应的汽车抽象
     * @param banner 汽车品牌
     * @return 生产的汽车
     */
    @Override
    public Car getCreateCar(String banner) {
        if (Objects.equals(banner,Car.BMW)){
            return  new BmwCar();
        } else if (Objects.equals(banner,Car.AUDI)){
            return  new AudiCar();
        }
        throw  new RuntimeException("未找到品牌");
    }

    /**
     * 根据颜色类型 选择汽车颜色
     *
     * @param color 颜色类型
     * @return 颜色
     */
    @Override
    public CarColor getFillColor(String color) {
        return null;
    }
}
