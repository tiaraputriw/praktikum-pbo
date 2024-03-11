package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        Segitiga segitiga = new Segitiga(5, 8, 3);
        persegi.printInfo();
        segitiga.printInfoSegitiga();
        System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());
        System.out.println("Luas Segitiga : " + segitiga.hitungLuasSegitiga());
    }
}
