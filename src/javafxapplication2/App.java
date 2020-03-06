/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

/**
 *
 * @author RIHAB
 */
public class App {
    private static String Brand;
    private static String Model;
    private static String Color;

    public static String getBrand() {
        return Brand;
    }

    public static String getModel() {
        return Model;
    }

    public static String getColor() {
        return Color;
    }

    public static void setBrand(String Brand) {
        App.Brand = Brand;
    }

    public static void setModel(String Model) {
        App.Model = Model;
    }

    public static void setColor(String Color) {
        App.Color = Color;
    }
    
    
}
