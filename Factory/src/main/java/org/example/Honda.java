package org.example;

public class Honda implements iCarAssembly{
    public static String CarColor="Red";
    @Override
    public void getCarmodel() {
        System.out.println("Make is Honda and color is "+CarColor);
    }
}
