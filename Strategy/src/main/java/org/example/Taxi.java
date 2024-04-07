package org.example;

public class Taxi implements iTravelStrategy{
    @Override
    public void gotoAirport() {
        System.out.println("Travel by Taxi");
    }
}
