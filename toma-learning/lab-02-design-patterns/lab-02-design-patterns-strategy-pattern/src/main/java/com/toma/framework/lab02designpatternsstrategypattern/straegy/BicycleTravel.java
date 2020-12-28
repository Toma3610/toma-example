package com.toma.framework.lab02designpatternsstrategypattern.straegy;

/**
 * 自行车出行
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/28
 */
public class BicycleTravel implements Travel{
    /**
     * 定义出行方式的方法
     * 1.自行车
     * 2.汽车
     */
    @Override
    public void doTravelMode() {
        System.out.println("自行车出行-策略");
    }
}
