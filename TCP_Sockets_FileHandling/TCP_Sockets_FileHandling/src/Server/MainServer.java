/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import DataHandling.FileHandler;
import DataHandling.Florist;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jarlc
 */
public class MainServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
    try
        {
            ServerSocket ss = new ServerSocket(3030);
            System.out.println("Server is Running");
            String st = "";
            System.out.println("Connection Accepted from Client Anila");
            Socket client = ss.accept();
            ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(client.getInputStream());
            
            while(!st.equalsIgnoreCase("EXIT"))
            {

                st = (String) ois.readObject();
                System.out.println("Message Received from client is: "+st);
                if(st.equalsIgnoreCase("Florist"))
                {
                    FileHandler fh = new FileHandler();
                    ArrayList<Florist> items = fh.RetrieveInfo();
                    oos.writeObject(items);
                }
                else
                {
                    Scanner sc = new Scanner(System.in);
                    String msg = sc.nextLine();
                    oos.writeObject(msg);
                }
            }
            oos.close();
            ois.close();
            client.close();
            ss.close();
        }
        catch(IOException ex)
        {
            Logger.getLogger(MainServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
