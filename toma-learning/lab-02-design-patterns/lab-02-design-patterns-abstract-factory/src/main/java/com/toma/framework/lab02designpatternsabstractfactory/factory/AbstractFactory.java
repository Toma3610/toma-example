package com.toma.framework.lab02designpatternsabstractfactory.factory;

import com.toma.framework.lab02designpatternsabstractfactory.factory.car.Car;
import com.toma.framework.lab02designpatternsabstractfactory.factory.color.CarColor;

/**
 * 抽象工厂基类
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/20
 */
public abstract class AbstractFactory {
    /**
     * 定义产品类型
     */
    public static String CAR = "car";
    public static String COLOR = "color";
    /**
     * 根据汽车品牌生产对应的汽车抽象
     * @param banner 汽车品牌
     * @return 生产的汽车
     */
    public abstract Car getCreateCar(String banner);
    /**
     * 根据颜色类型 选择汽车颜色
     * @param color 颜色类型
     * @return 颜色
     */
    public abstract CarColor getFillColor(String color);
}
