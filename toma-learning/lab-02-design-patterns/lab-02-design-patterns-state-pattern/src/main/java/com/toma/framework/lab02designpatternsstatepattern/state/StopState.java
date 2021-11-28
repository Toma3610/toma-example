package com.toma.framework.lab02designpatternsstatepattern.state;

/**
 * 结束状态
 *
 * @author QiuQN
 * @version 1.0
 * @since 2021/1/10
 */
public class StopState implements State{
    @Override
    public void doAction(StateContext context) {
        System.out.println("结束状态");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
