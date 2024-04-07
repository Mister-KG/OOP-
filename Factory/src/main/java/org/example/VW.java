package org.example;

public class VW implements iCarAssembly{
    public static String CarColor = "Green";
    @Override
    public void getCarmodel() {
        System.out.println("Make is VW and color is "+CarColor);
    }
}
