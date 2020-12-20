package com.toma.framework.lab02designpatternssimplefactory.factory;

/**
 * 产品基类
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/20
 */
public interface Product {

    /**
     * 底盘
     */
    String CHASSIS = "Chassis";
    /**
     * 轮胎
     */
    String TIRES = "Tires";
    /**
     * 玻璃
     */
    String PLASTIC = "Plastic";

    /**
     * 创建产品
     */
    void createProduct();

}
