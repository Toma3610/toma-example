package com.toma.framework.lab02designpatternsabstractfactory.factory.color;

/**
 * 红色颜色
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/20
 */
public class RedCarColor implements CarColor{
    @Override
    public void fillColor() {
        System.out.println("选择了红色");
    }
}
