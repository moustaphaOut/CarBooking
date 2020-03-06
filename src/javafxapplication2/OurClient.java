/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.Serializable;

/**
 *
 * @author RIHAB
 */
public class OurClient implements Serializable{
    private String FName;
    private String Id;
    private String Adress;
    private String PNumber;
    private String Date;
    private String Country;
    private String Brand;
    private String Model;
    private String Color;

    public OurClient(String FName, String Id, String Adress, String PNumber, String Date, String Country, String Brand, String Model, String Color) {
        this.FName = FName;
        this.Id = Id;
        this.Adress = Adress;
        this.PNumber = PNumber;
        this.Date = Date;
        this.Country = Country;
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

    public String getFName() {
        return FName;
    }

    public String getId() {
        return Id;
    }

    public String getAdress() {
        return Adress;
    }

    public String getPNumber() {
        return PNumber;
    }

    public String getDate() {
        return Date;
    }

    public String getCountry() {
        return Country;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public void setPNumber(String PNumber) {
        this.PNumber = PNumber;
    }
    
    public void setDate(String Date) {
        this.Date = Date;
    }

    public void setCountry(String Country) {
        this.Country = Country;
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
    
}
