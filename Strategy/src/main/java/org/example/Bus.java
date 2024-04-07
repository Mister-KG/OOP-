package org.example;

public class Bus implements iTravelStrategy{
    @Override
    public void gotoAirport() {
        System.out.println("Travel by Bus");
    }
}
