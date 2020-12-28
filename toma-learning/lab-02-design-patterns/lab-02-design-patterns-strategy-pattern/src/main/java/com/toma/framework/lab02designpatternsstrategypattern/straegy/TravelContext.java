package com.toma.framework.lab02designpatternsstrategypattern.straegy;

/**
 * 出行方式-策略控制器
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/28
 */
public class TravelContext {
    private Travel travel;
    public void setTravel(Travel travel) {
        this.travel = travel;
    }
    public void performTravel() {
        if (this.travel != null) this.travel.doTravelMode();
    }
}
