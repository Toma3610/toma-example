package com.toma.framework.lab02designpatternsstrategypattern;


import com.toma.framework.lab02designpatternsstrategypattern.straegy.BicycleTravel;
import com.toma.framework.lab02designpatternsstrategypattern.straegy.CarTravel;
import com.toma.framework.lab02designpatternsstrategypattern.straegy.TravelContext;

public class Lab02DesignPatternsStrategyPatternApplication {

    public static void main(String[] args) {
        TravelContext travelContext = new TravelContext();
        travelContext.setTravel(new CarTravel());
        travelContext.performTravel();

        travelContext.setTravel(new BicycleTravel());
        travelContext.performTravel();
    }
}
