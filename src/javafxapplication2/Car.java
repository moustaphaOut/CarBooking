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
public class Car {
    private String Brand;
    private String Model;
    private String Color;
    private int number;

    public Car(int number, String Brand, String Model, String Color) {
        this.number = number;
        this.Brand = Brand;
        this.Model = Model;
        this.Color = Color;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public String getColor() {
        return Color;
    }

    public int getNumber() {
        return number;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    
}
