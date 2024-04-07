package org.example;

public class Main {
    public static void main(String[] args) {
      iCarAssembly obj = CarFactory.GetCarInstance(2);
      obj.getCarmodel();
    }
}