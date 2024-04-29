/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Manajer extends Pegawai{
    //{Kamus}
    private final int tunjangan;
    
    //{Algoritma}
    public Manajer(String nama) {
        super(nama);
        this.tunjangan = 700000;
    }
    
    @Override
    public void tampilData(){
        System.out.println("Nama : " + this.nama + ", Gaji pokok : " + this.gajiPokok);
        System.out.println("Tunjangan : " + this.tunjangan);
    }
}
