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
import java.util.ArrayList;

/**
 *
 * @author RIHAB
 */
public class ListCar {
    ArrayList<Car> list = new ArrayList<Car>();
    public  ArrayList<Car> Initialize(){
        list.add(new Car(25,"Audi" , "Q7" , "WHITE"));
        list.add(new Car(34,"Audi" , "A7" , "BLUE"));
        list.add(new Car(12,"Audi" , "Q7" , "BLACK"));
        list.add(new Car(10,"Audi" , "Rs7" , "BLUE"));
        list.add(new Car(32,"BMW" , "Serie4" , "WHITE"));
        list.add(new Car(55,"BMW" , "X7" , "BLACK"));
        list.add(new Car(15,"BMW" , "Serie7" , "WHITE"));
        list.add(new Car(33,"BMW" , "I8" , "BLACK"));
        list.add(new Car(26,"Mercedes-Benz" , "Class A" , "BLACK"));
        list.add(new Car(60,"Mercedes-Benz" , "Class GLA" , "WHITE"));
        list.add(new Car(36,"Mercedes-Benz" , "Class E" , "BLACK"));
        list.add(new Car(5,"Mercedes-Benz" , "Class S" , "WHITE")); 
        list.add(new Car(39,"Volkswagen" , "Golf" , "BLUE"));
        list.add(new Car(100,"Volkswagen" , "Passat" , "BLUE"));   
        list.add(new Car(265,"Volkswagen" , "Polo" , "WHITE"));
        list.add(new Car(64,"Volkswagen" , "Touareg" , "BLACK"));  
        return list;
    }
    public ArrayList<Car> read() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream("Car\\car.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        list = (ArrayList)ois.readObject();
        ois.close(); 
        fis.close();
        return list;
    }
    public void Save(ArrayList<Car> list) throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream("Car\\car.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
        oos.close(); 
        fos.close();
        
    }
    
}
