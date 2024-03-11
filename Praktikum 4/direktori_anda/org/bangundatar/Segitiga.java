package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double tinggi, alas;
    
    public Segitiga(double alas, double tinggi, int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuasSegitiga(){
        return 0.5 * alas * tinggi;
    }

    public void printInfoSegitiga(){
        System.out.println("Bangun Segitiga bersisi : " + this.getJumlahSisi());
    }
}
