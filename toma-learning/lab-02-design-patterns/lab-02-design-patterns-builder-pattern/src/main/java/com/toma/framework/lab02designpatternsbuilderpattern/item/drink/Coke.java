package com.toma.framework.lab02designpatternsbuilderpattern.item.drink;

/**
 * 扩展饮料-可口可乐
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/25
 */
public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 3.0f;
    }
}
