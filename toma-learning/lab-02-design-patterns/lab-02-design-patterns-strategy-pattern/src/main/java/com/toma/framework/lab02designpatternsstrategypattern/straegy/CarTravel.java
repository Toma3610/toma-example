package com.toma.framework.lab02designpatternsstrategypattern.straegy;

/**
 * 汽车出行
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/28
 */
public class CarTravel implements Travel{
    /**
     * 定义出行方式的方法
     * 1.自行车
     * 2.汽车
     */
    @Override
    public void doTravelMode() {
        System.out.println("汽车出行-策略");
    }
}
