/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public abstract class Pegawai {
    //{Kamus}
    protected String nama;
    protected final int gajiPokok;
    
    //{Algoritma}
    public Pegawai(String nama){
        this.nama = nama;
        this.gajiPokok = 5000000;
    }
    public void setNama(String nama){
        this.nama = nama;
    }   
    
    public abstract void tampilData();
}
