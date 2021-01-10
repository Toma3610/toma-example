package com.toma.framework.lab02designpatternstemplatepattern;


import com.toma.framework.lab02designpatternstemplatepattern.template.BaseGame;
import com.toma.framework.lab02designpatternstemplatepattern.template.LolGame;
import com.toma.framework.lab02designpatternstemplatepattern.template.Nba2kOlGame;

public class Lab02DesignPatternsTemplatePatternApplication {

    public static void main(String[] args) {
        BaseGame lolGame = new LolGame();
        lolGame.playGame();
        System.out.println("=======================================");
        BaseGame nba2kOlGame = new Nba2kOlGame();
        nba2kOlGame.playGame();
    }

}
