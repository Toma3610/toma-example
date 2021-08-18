package com.toma.framework.lab02designpatternsstatepattern.state;

/**
 * 状态
 *
 * @author QiuQN
 * @version 1.0
 * @since 2021/1/10
 */
public interface State {
    void doAction(StateContext context);
}
