/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp_sockets_filehandling;

import DataHandling.Florist;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jarlc
 */
public class TCP_Sockets_FileHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        try
        {
            Socket client = new Socket("127.0.0.1",3030);
            System.out.println("Client is running Anila");
            String st = "";
            ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(client.getInputStream());
            
            while(!st.equalsIgnoreCase("EXIT"))
            {
                Scanner sc = new Scanner(System.in);
                String msg = sc.nextLine();
                
                
                oos.writeObject(msg);
                if (msg.equalsIgnoreCase("Florist")) 
                {
                    ArrayList<Florist> flowers = new ArrayList<Florist>();
                    flowers = (ArrayList<Florist>) ois.readObject();
                    for(Florist s : flowers) System.out.println(String.format("Flower: %s \tCost: %s",s.getName(),s.getCost()));
                }
                else
                {
                    st = (String) ois.readObject();
                
                    System.out.println("Message Received from server: "+st);
                }
                
            }
            oos.close();
            ois.close();
            client.close();
        }
        catch(IOException ex)
        {
            Logger.getLogger(TCP_Sockets_FileHandling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
