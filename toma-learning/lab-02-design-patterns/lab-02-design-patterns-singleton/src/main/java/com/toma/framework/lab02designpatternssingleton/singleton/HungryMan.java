package com.toma.framework.lab02designpatternssingleton.singleton;

/**
 * 饿汉模式
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/19
 */
public class HungryMan {
    private static HungryMan hungryMan =new HungryMan();
    private HungryMan() {}
    /**
     * 饿汉模式 直接实例化对象 不会产生线程安全问题 但是就不节约资源了
     * @return 获取唯一的实例对象
     */
    public static HungryMan getUniqueInstance(){
        return hungryMan;
    }
    public static void main(String[] args) {
        HungryMan uniqueInstance = HungryMan.getUniqueInstance();
    }
}
