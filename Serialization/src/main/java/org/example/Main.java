package org.example;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
       Employee e = new Employee();
       e.name="Simba Zengeni";
       e.address="6 cii rys";
       e.phone="+27456";

       e.Display();

       try{
           FileOutputStream fos = new FileOutputStream("employee.ser");
           ObjectOutputStream oos =new ObjectOutputStream(fos);
           oos.writeObject(e);
           oos.close();
           fos.close();
           System.out.println("Serialization complete");

       }catch (Exception mes){
           System.out.println("Error:"+mes.toString());
       }

    }
}