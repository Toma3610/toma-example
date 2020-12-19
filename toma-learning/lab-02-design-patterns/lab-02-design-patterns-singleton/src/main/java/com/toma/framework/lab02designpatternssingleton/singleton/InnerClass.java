package com.toma.framework.lab02designpatternssingleton.singleton;

/**
 * 静态内部类
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/19
 */
public class InnerClass {
    private InnerClass() { }
    /**
     * 定义内部类
     * 内部实现 对象的初始化
     */
    private static class SingletonHolder{
        private static final InnerClass INSTANCE = new InnerClass();
    }
    /**
     * 通过内部类的特性
     * 只有真正调用的时候才会实例化 JVM内部保证了其安全性只能实例化一次
     * @return 获取唯一的实例对象
     */
    public static InnerClass getUniqueInstance(){
        return SingletonHolder.INSTANCE;
    }
    public static void main(String[] args) {
        InnerClass uniqueInstance = InnerClass.getUniqueInstance();
    }
}
