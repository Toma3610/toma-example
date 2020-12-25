package com.toma.framework.lab02designpatternsbuilderpattern.item;

import com.toma.framework.lab02designpatternsbuilderpattern.item.burger.ChickenBurger;
import com.toma.framework.lab02designpatternsbuilderpattern.item.burger.VegBurger;
import com.toma.framework.lab02designpatternsbuilderpattern.item.drink.Coke;
import com.toma.framework.lab02designpatternsbuilderpattern.item.drink.Pepsi;

/**
 * 构建用餐商品
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/25
 */
public class MealItemBuild {
    /**
     * 构建蔬菜套餐
     * @return 餐品
     */
    public MealItem buyVegBurger(){
        MealItem mealItem = new MealItem();
        mealItem.addItem(new VegBurger());
        mealItem.addItem(new Pepsi());
        return mealItem;
    }
    /**
     * 构建鸡肉汉堡套餐
     * @return 餐品
     */
    public MealItem buyChickenBurger(){
        MealItem mealItem = new MealItem();
        mealItem.addItem(new ChickenBurger());
        mealItem.addItem(new Coke());
        return mealItem;
    }
}
