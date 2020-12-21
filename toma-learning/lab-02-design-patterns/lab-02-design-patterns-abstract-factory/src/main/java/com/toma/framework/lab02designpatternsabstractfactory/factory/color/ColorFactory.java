package com.toma.framework.lab02designpatternsabstractfactory.factory.color;

import com.toma.framework.lab02designpatternsabstractfactory.factory.AbstractFactory;
import com.toma.framework.lab02designpatternsabstractfactory.factory.car.Car;
import com.toma.framework.lab02designpatternsabstractfactory.factory.color.BlueCarColor;
import com.toma.framework.lab02designpatternsabstractfactory.factory.color.CarColor;
import com.toma.framework.lab02designpatternsabstractfactory.factory.color.RedCarColor;

import java.util.Objects;

/**
 * 颜色工厂类
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/20
 */
public class ColorFactory extends AbstractFactory {
    /**
     * 根据汽车品牌生产对应的汽车抽象
     *
     * @param banner 汽车品牌
     * @return 生产的汽车
     */
    @Override
    public Car getCreateCar(String banner) {
        return null;
    }

    /**
     * 根据颜色类型 选择汽车颜色
     *
     * @param color 颜色类型
     * @return 颜色
     */
    @Override
    public CarColor getFillColor(String color) {
        if (Objects.equals(color,CarColor.BLUE)){
            return new BlueCarColor();
        } else if (Objects.equals(color,CarColor.RED)){
            return new RedCarColor();
        }
        throw  new RuntimeException("未找到颜色");
    }
}
