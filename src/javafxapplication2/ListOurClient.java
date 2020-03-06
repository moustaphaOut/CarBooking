/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author RIHAB
 */
public class ListOurClient {
    
    ArrayList<OurClient> list = new ArrayList<OurClient>();
    
    public ArrayList<OurClient> get() throws FileNotFoundException, IOException, ClassNotFoundException{
        list.add(new OurClient("Moustapha El Outmani", "1560", "Casa", "0612345689", "2018-05-09", "Morocco", "Ford", "Mustang", "Red"));
        FileOutputStream fos = new FileOutputStream("Clients\\clients.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
        oos.close(); 
        fos.close();
        return list;
    }
    public ArrayList<OurClient> read() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream("Clients\\clients.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        list = (ArrayList)ois.readObject();
        ois.close(); 
        fis.close();
        return list;
    }
    public void Save(ArrayList<OurClient> list) throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream("Clients\\clients.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
        oos.close(); 
        fos.close();
        
    }
    
}































