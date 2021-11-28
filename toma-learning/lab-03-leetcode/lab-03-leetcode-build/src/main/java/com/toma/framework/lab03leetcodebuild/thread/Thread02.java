package com.toma.framework.lab03leetcodebuild.thread;

import cn.hutool.json.JSONUtil;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 多线程学习day02
 *
 * @author Toma
 * @version 1.0
 * @since 2021/8/19
 */
public class Thread02 {

    private static final Object LOCK = new Object();

    static volatile int baseComm = 0;

    public static class Thread02_1 implements Runnable {
        @Override
        public void run() {

            synchronized (LOCK) { // 对象同步锁 避免串行执行
                baseComm = baseComm + 1;
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }
    }

    public static class Thread02_2 implements Runnable {
        @Override
        public void run() {
            synchronized (LOCK) { // 对象同步锁 避免串行执行
                baseComm = baseComm + 1;
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        new Thread(new Thread02_1()).start();
        Thread.sleep(100);
        new Thread(new Thread02_2()).start();
        // 使用 volatile 关键字 信号量通同步  如果不sleep 则主内存暂未同步 所以baseComm 则是 1
        Thread.sleep(100); // 进行主内存同步等待 此时 baseComm 则是 2
        System.out.println("============================>" + baseComm);
    }

}
