package org.example;

public class Auto implements iTravelStrategy{
    @Override
    public void gotoAirport() {
        System.out.println("Travel by Auto");
    }
}
