package com.toma.framework.lab02designpatternssimplefactory.factory;

import java.util.Objects;

/**
 * 工厂基类
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/20
 */
public class SimpleFactory {

    /**
     * 根据产品类型生产不同的产品对象
     * @param typeOfAccessories 产品类型
     * @return 具体的产品示例
     */
    public Product baseCreateCar(String typeOfAccessories) {
        if (Objects.equals(typeOfAccessories, Product.CHASSIS)) {
            return new SupplierChassisProduct();
        } else if (Objects.equals(typeOfAccessories, Product.PLASTIC)) {
            return new SupplierPlasticProduct();
        } else if (Objects.equals(typeOfAccessories, Product.TIRES)) {
            return new SupplierTiresProduct();
        }
        throw new RuntimeException("没有对应的配件");
    }

}
