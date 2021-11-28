package com.toma.framework.lab03leetcodebuild.thread;

import java.util.concurrent.*;

/**
 * @author Toma
 * @version 1.0
 * @since 2021/8/18
 */
public class Thread01 {

    public static class Thread01_1 extends Thread {
        @Override
        public void run() {
            System.out.println("Thread - 01");
        }
    }

    public static class Thread01_2 implements Runnable {

        @Override
        public void run() {
            System.out.println("runnable - 02");
        }
    }

    public static class Thread01_3 implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            Thread.sleep(1000);
            return 3610;
        }
    }




    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> integerFutureTask = new FutureTask<Integer>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(500);
                return 5657;
            }
        });

        Thread01_1 thread01 = new Thread01_1();
        thread01.start();
        System.out.println("线程组名称:" + thread01.getThreadGroup().getName());
        System.out.println("线程名称:" + thread01.getName());

        new Thread01_2().run();
        new Thread(() -> {
            System.out.println("lambda");
        }).start();

        Thread01_3 thread01_3 = new Thread01_3();
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> submit = executorService.submit(thread01_3);
//        submit.cancel(true);
        System.out.println(submit.get());

        executorService.submit(integerFutureTask);
        System.out.println(integerFutureTask.get());


    }


}
