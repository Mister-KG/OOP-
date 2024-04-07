package org.example;

public class CarFactory {
    public static iCarAssembly GetCarInstance(int id){
        switch (id){
            case 0:
                return new Honda();
            case 1:
                return new Toyota();
            case 2:
                return new BMW();
            case 3:
                return new VW();
            default:
                return null;
        }
    }
}
