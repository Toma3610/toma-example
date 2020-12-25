package com.toma.framework.lab02designpatternsbuilderpattern.item.burger;

import com.toma.framework.lab02designpatternsbuilderpattern.item.Item;
import com.toma.framework.lab02designpatternsbuilderpattern.item.pack.Packing;
import com.toma.framework.lab02designpatternsbuilderpattern.item.pack.Wrapper;

/**
 * 汉堡商品
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/25
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
    @Override
    public abstract float price();
}
