package org.example;

public class BMW implements iCarAssembly{
    public static String CarColor="Yellow";
    @Override
    public void getCarmodel() {
        System.out.println("Make is BMW and color is "+CarColor);
    }
}
