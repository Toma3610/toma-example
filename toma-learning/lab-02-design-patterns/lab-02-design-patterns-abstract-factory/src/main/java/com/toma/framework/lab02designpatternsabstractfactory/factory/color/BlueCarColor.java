package com.toma.framework.lab02designpatternsabstractfactory.factory.color;

/**
 * 生产蓝色
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/20
 */
public class BlueCarColor implements CarColor{
    @Override
    public void fillColor() {
        System.out.println("选择了蓝色");
    }
}
