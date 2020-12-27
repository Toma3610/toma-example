package com.toma.framework.lab02designpatternscommandpattern.command;

/**
 * 关灯命令
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/27
 */
public class PowerOffCommand implements Command{
    /**
     *灯 关闭接口 实现命令方法  引入灯对象
     */
    protected Power power;
    public PowerOffCommand(Power power) {
        this.power = power;
    }
    @Override
    public void execute() {
        this.power.off();
    }
}
