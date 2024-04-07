package org.example;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializing {
    public static void main(String[] args){
        try {
            Employee emp = new Employee();
            FileInputStream fis= new FileInputStream("employee.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            emp =(Employee) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("Deserialization complete");
            emp.Display();
        } catch (Exception mes) {
            System.out.println("Error:"+mes.toString());
        }
    }
}
