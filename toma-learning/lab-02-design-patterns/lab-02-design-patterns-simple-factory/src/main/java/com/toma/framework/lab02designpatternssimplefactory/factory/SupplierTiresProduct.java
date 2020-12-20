package com.toma.framework.lab02designpatternssimplefactory.factory;

/**
 * 轮胎供应商
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/20
 */
public class SupplierTiresProduct implements Product {
    /**
     * 生产具体的产品
     */
    @Override
    public void createProduct() {
        System.out.println("这是一个汽车轮胎供应商---Tires");
    }
}
