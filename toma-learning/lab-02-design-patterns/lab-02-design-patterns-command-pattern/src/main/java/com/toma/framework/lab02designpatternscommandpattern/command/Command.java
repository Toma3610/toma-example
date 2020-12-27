package com.toma.framework.lab02designpatternscommandpattern.command;

/**
 * 命令执行接口
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/27
 */
public interface Command {
    /**
     * 创建一个命令执行方法
     */
    void execute();
}
