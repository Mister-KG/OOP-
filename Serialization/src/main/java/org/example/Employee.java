package org.example;

public class Employee implements java.io.Serializable{
    public String name,address,phone;
    public void Display(){
        System.out.println(name+" stays at "+address+" and phone is "+phone);
    }

}
