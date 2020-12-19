package com.toma.framework.lab02designpatternssingleton.singleton;

/**
 * 懒汉式-线程安全
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/19
 */
public class LazyManSync {
    private static LazyManSync lazyMan;
    /*私有构造 不允许外部实例化对象*/
    private LazyManSync() { }
    /**
     * 对获取实例方法进行加锁 可以避免多线程环境多次进行实例化
     * 但当一个线程进入该方法内 其他访问的线程就被阻塞 阻塞时间过长会引起性能问题 一般不推荐该方案
     * @return 获取唯一的实例对象
     */
    public static synchronized LazyManSync getUniqueInstance() {
        if (lazyMan == null) {
            lazyMan = new LazyManSync();
        }
        return lazyMan;
    }
    public static void main(String[] args) {
        LazyManSync uniqueInstance = LazyManSync.getUniqueInstance();
    }
}
