package com.toma.framework.lab02designpatternssingleton.singleton;

/**
 * 懒汉式-线程不安全
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/19
 */
public class LazyMan {
    private static LazyMan lazyMan;
    /*私有构造 不允许外部实例化对象*/
    private LazyMan() { }
    /**
     * 此方法在多线程环境下是不安全的 多个线程进行访问会产生多个实例
     * @return 获取唯一的实例对象
     */
    public static LazyMan getUniqueInstance() {
        if (lazyMan == null) {
            lazyMan = new LazyMan();
        }
        return lazyMan;
    }
    public static void main(String[] args) {
        LazyMan uniqueInstance = LazyMan.getUniqueInstance();
    }
}
