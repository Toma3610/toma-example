package com.toma.framework.lab02designpatternsstatepattern;


import com.toma.framework.lab02designpatternsstatepattern.state.StartState;
import com.toma.framework.lab02designpatternsstatepattern.state.StateContext;
import com.toma.framework.lab02designpatternsstatepattern.state.StopState;

public class Lab02DesignPatternsStatePatternApplication {

    public static void main(String[] args) {
        StateContext context =new StateContext();

        StartState startState =new StartState();
        startState.doAction(context);
        startState.toString();
        System.out.println(context.getState().toString());

        StopState stopState =new StopState();
        stopState.doAction(context);
        stopState.toString();
        System.out.println(context.getState().toString());

    }

}
