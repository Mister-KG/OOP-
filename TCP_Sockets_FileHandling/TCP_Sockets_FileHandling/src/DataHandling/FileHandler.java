/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataHandling;
import java.util.*;
import java.io.*;

/**
 *
 * @author jarlc
 */
public class FileHandler {
    private final String path = "Florist.txt";
    //"Florist.txt" if the file is saved in root folder
    public FileHandler()
    {
        
    }
    
    public ArrayList<Florist> RetrieveInfo()
    {
        try
        {
            ArrayList<Florist> items = new ArrayList<Florist>();
            File file = new File(path); 
  
            BufferedReader br = new BufferedReader(new FileReader(file)); 
  
            String st; 
            
            while ((st = br.readLine())!= null) 
            {
                String[] values = st.split("#");
                items.add(new Florist(values[0],Float.parseFloat(values[1])));
            }
   
            return items;
        }
        catch(IOException ex)
        {
            System.out.println(ex);
            return null;
        }
    }
}
