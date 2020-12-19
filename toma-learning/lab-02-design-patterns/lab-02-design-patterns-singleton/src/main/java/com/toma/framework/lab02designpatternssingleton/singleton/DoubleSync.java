package com.toma.framework.lab02designpatternssingleton.singleton;

/**
 * 双重校验锁-线程安全
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/19
 */
public class DoubleSync {
    private volatile static DoubleSync instance;
    private DoubleSync() { }
    /**
     * 只有当 uniqueInstance 为空情况 才进行加锁处理
     * 使用关键字 volatile 对线程对象变化直达内存空间 真正进行实例化的操作只有一个线程进入 保证安全性
     *
     * @return 获取唯一的实例对象
     */
    public static DoubleSync getUniqueInstance() {
        if (instance == null) {
            synchronized (DoubleSync.class) {
                if (instance == null) {
                    instance = new DoubleSync();
                }
            }
        }
        return instance;
    }
    public static void main(String[] args) {
        DoubleSync uniqueInstance = DoubleSync.getUniqueInstance();
    }
}
