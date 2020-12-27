package com.toma.framework.lab02designpatternscommandpattern;


import com.toma.framework.lab02designpatternscommandpattern.command.Invoker;
import com.toma.framework.lab02designpatternscommandpattern.command.Power;
import com.toma.framework.lab02designpatternscommandpattern.command.PowerOffCommand;
import com.toma.framework.lab02designpatternscommandpattern.command.PowerOnCommand;

public class Lab02DesignPatternsCommandPatternApplication {

    public static void main(String[] args) {
        Invoker invoker =new Invoker();
        Power power = new Power();

        PowerOnCommand powerOnCommand = new PowerOnCommand(power);
        invoker.addCommand(powerOnCommand);

        PowerOffCommand powerOffCommand = new PowerOffCommand(power);
        invoker.addCommand(powerOffCommand);

        invoker.placeCommand();
    }

}
