package com.toma.framework.lab02designpatternsbuilderpattern.item;

import java.util.ArrayList;
import java.util.List;

/**
 * 购买用餐商品
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/25
 */
public class MealItem {
    private List<Item> itemList = new ArrayList<>();
    public void addItem(Item item) {
        this.itemList.add(item);
    }
    public float getCost() {
        float totalCost = 0.0f;
        for (Item item : this.itemList) {
            totalCost += item.price();
        }
        return totalCost;
    }
    public void showItems(){
        for (Item item : itemList) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
