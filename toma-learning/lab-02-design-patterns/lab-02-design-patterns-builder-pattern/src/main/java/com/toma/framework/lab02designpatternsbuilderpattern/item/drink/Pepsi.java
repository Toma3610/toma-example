package com.toma.framework.lab02designpatternsbuilderpattern.item.drink;

/**
 * 扩展饮料-百事可乐
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/25
 */
public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "pepsi";
    }
    @Override
    public float price() {
        return 5.0f;
    }
}
