package com.toma.framework.lab02designpatternsbuilderpattern;


import com.toma.framework.lab02designpatternsbuilderpattern.item.MealItem;
import com.toma.framework.lab02designpatternsbuilderpattern.item.MealItemBuild;

public class Lab02DesignPatternsBuilderPatternApplication {

    public static void main(String[] args) {
        MealItemBuild mealItemBuild = new MealItemBuild();

        MealItem mealItem = mealItemBuild.buyChickenBurger();
        mealItem.showItems();
        System.out.println("total cost:"+mealItem.getCost());

        System.out.println("============================================================================");

        MealItem mealItem1 = mealItemBuild.buyVegBurger();
        mealItem1.showItems();
        System.out.println("total cost:"+mealItem1.getCost());
    }

}
