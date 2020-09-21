package com.company;

public class Sneaker {
    public String Name; //Nam
    public int Price; //Retail Preis
    public String Style; //Identifikationsnummer
    public String Date; //Release Datum
    public String Brands; //Marke
    @Override
    public String toString(){
        return this.Name + "\n Brands:"+Brands +"\n Price: "+Price+"$"+"\n Release Date:" +Date+"\n";
    }
}