package com.toma.framework.lab02designpatternscommandpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令转送站
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/27
 */
public class Invoker {
    /**
     * 组合命令容器
     */
    private List<Command> commandList =new ArrayList<>();
    /**
     * 添加命令到命令容器
     * @param command 命令对象
     */
    public void addCommand(Command command){
        this.commandList.add(command);
    }
    /**
     * 执行命令容器的各个命令
     */
    public void placeCommand(){
        for (Command command : commandList) {
            command.execute();
        }
        this.commandList.clear();
    }
}
