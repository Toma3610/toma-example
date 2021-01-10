package com.toma.framework.lab02designpatternstemplatepattern.template;

/**
 * 抽象游戏基类
 *
 * @author QiuQN
 * @version 1.0
 * @since 2021/1/5
 */
public abstract class BaseGame {

    public final void playGame() {
        this.startGame();

        this.displayGame();

        this.finishGame();
    }
    /**
     * 自定义游戏
     */
    public abstract void displayGame();
    void startGame() {
        System.out.println("开始游戏");
    }
    void finishGame() {
        System.out.println("结束游戏");
    }
}
