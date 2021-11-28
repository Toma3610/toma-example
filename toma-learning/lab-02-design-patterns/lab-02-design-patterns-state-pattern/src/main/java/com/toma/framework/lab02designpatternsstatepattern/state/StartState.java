package com.toma.framework.lab02designpatternsstatepattern.state;

/**
 * 开始状态
 *
 * @author QiuQN
 * @version 1.0
 * @since 2021/1/10
 */
public class StartState implements State{
    @Override
    public void doAction(StateContext context) {
        System.out.println("开始动作状态");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "start state";
    }
}
