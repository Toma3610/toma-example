package com.toma.framework.lab02designpatternsstatepattern.state;

/**
 * 动作上下文
 *
 * @author QiuQN
 * @version 1.0
 * @since 2021/1/10
 */
public class StateContext {
    private State state;

    public StateContext() {
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
