package com.toma.framework.lab02designpatternsbuilderpattern.item.burger;

/**
 * 扩展汉堡商品
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/25
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg-Burger";
    }

    @Override
    public float price() {
        return 25.5f;
    }
}
