package com.toma.framework.lab02designpatternsbuilderpattern.item;

import com.toma.framework.lab02designpatternsbuilderpattern.item.pack.Packing;

/**
 * 商品
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/25
 */
public interface Item {
     String name();
     Packing packing();
     float price();
}
