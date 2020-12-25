package com.toma.framework.lab02designpatternsbuilderpattern.item.drink;

import com.toma.framework.lab02designpatternsbuilderpattern.item.pack.Bottle;
import com.toma.framework.lab02designpatternsbuilderpattern.item.Item;
import com.toma.framework.lab02designpatternsbuilderpattern.item.pack.Packing;

/**
 * 饮料商品
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/25
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
    @Override
    public abstract float price();
}
