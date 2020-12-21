package com.toma.framework.lab02designpatternsabstractfactory;


import com.toma.framework.lab02designpatternsabstractfactory.factory.AbstractFactory;
import com.toma.framework.lab02designpatternsabstractfactory.factory.FactoryProduct;
import com.toma.framework.lab02designpatternsabstractfactory.factory.car.Car;
import com.toma.framework.lab02designpatternsabstractfactory.factory.color.CarColor;

public class Lab02DesignPatternsAbstractFactoryApplication {

    public static void main(String[] args) {
        AbstractFactory productColor = FactoryProduct.getProduct(AbstractFactory.COLOR);
        CarColor fillColor = productColor.getFillColor(CarColor.RED);
        fillColor.fillColor();

        AbstractFactory productCar = FactoryProduct.getProduct(AbstractFactory.CAR);
        Car car = productCar.getCreateCar(Car.BMW);
        car.createCar();
    }
}
