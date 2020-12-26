package com.toma.framework.lab02designpatternsprototypepattern.base;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 缓存对象
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/26
 */
public class LoadCache {
    private static final ConcurrentHashMap<String, BasePrototype> concurrentHashMap = new ConcurrentHashMap<>();
    public static BasePrototype getPrototype(String prototypeId) throws CloneNotSupportedException {
        BasePrototype basePrototype = concurrentHashMap.get(prototypeId);
        return (BasePrototype) basePrototype.clone();
    }
    public static void loadCache() {
        Car car = new Car();
        car.setId("car");
        concurrentHashMap.put(car.getId(), car);

        House house = new House();
        house.setId("house");
        concurrentHashMap.put(house.getId(), house);
    }
}
