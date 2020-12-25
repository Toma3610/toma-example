package com.toma.framework.lab02designpatternsbuilderpattern.item.burger;

/**
 * 鸡肉汉堡
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/25
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken-Burger";
    }
    @Override
    public float price() {
        return 39.9f;
    }
}
