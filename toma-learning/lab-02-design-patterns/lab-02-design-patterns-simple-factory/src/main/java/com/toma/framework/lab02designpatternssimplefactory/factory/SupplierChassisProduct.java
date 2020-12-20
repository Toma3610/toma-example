package com.toma.framework.lab02designpatternssimplefactory.factory;

/**
 * 底盘供应商
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/20
 */
public class SupplierChassisProduct implements Product{
    /**
     * 生产具体的产品
     */
    @Override
    public void createProduct() {
        System.out.println("这是一个汽车底盘供应商---Chassis");
    }
}
