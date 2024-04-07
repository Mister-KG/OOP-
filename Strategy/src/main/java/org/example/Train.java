package org.example;

public class Train implements iTravelStrategy {
    @Override
    public void gotoAirport() {
        System.out.println("Travel by Train");
    }
}
