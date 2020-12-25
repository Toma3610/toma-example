package com.toma.framework.lab02designpatternsbuilderpattern.item.pack;

/**
 * 包装方式-瓶子
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/25
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "bottle";
    }
}
