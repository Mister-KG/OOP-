package org.example;

import java.util.Scanner;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        System.out.println("Enter travel type: Bus o Taxi or Train or Auto");
        String input = sc.nextLine();
        TravelContext context = new TravelContext();

        if ("Bus".equalsIgnoreCase(input)){
            context.setStrategy(new Bus());
        }else if ("Taxi".equalsIgnoreCase(input)){
            context.setStrategy(new Taxi());
        } else if ("Train".equalsIgnoreCase(input)){
            context.setStrategy(new Train());
        }else if ("Auto".equalsIgnoreCase(input)){
            context.setStrategy(new Auto());
        }
        context.gotoAirport();
    }
}