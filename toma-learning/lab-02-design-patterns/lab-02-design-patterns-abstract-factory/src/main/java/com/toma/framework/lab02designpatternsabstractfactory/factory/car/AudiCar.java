package com.toma.framework.lab02designpatternsabstractfactory.factory.car;

/**
 * 生产奥迪汽车
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/20
 */
public class AudiCar implements Car{
    @Override
    public void createCar() {
        System.out.println("生产一辆奥迪汽车");
    }
}
