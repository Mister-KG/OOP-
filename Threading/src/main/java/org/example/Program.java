package org.example;

public class Program {
    public static void main(String[] args){
        Thread2 t2=new Thread2();
        Thread t = new Thread(t2);
        t.start();
    }
}
