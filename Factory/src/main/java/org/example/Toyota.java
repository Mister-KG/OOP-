package org.example;

public class Toyota implements iCarAssembly {
    public static String CarColor="Black";
    @Override
    public void getCarmodel() {
        System.out.println("Make is Toyota and color is "+ CarColor);
    }
}
