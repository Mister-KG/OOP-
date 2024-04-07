package org.example;

public class TravelContext {
    private iTravelStrategy myStrategy;

    public void setStrategy(iTravelStrategy strategy){
        this.myStrategy=strategy;
    }
    public iTravelStrategy getMyStrategy(){
        return myStrategy;
    }

    public void  gotoAirport(){
        myStrategy.gotoAirport();
    }

}
