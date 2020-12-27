package com.toma.framework.lab02designpatternscommandpattern.command;

/**
 * 创建一个开关
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/27
 */
public class Power {
    public void on(){
        System.out.println("打开了 开关");
    }
    public void off(){
        System.out.println("关闭了 开关");
    }
}
