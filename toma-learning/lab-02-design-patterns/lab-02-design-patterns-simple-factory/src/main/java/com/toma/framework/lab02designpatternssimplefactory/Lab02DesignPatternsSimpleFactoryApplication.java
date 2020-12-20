package com.toma.framework.lab02designpatternssimplefactory;


import com.toma.framework.lab02designpatternssimplefactory.factory.Product;
import com.toma.framework.lab02designpatternssimplefactory.factory.SimpleFactory;

public class Lab02DesignPatternsSimpleFactoryApplication {

    public static void main(String[] args) {
        SimpleFactory simpleFactory =new SimpleFactory();
        // 底盘
        Product chassis = simpleFactory.baseCreateCar(Product.CHASSIS);
        chassis.createProduct();

        // 玻璃
        Product plastic = simpleFactory.baseCreateCar(Product.PLASTIC);
        plastic.createProduct();

        // 轮胎
        Product tires = simpleFactory.baseCreateCar(Product.TIRES);
        tires.createProduct();
    }

}
