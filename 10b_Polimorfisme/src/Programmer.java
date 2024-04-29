/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Programmer extends Pegawai{
    //{Kamus}
    private final int bonus;
    
    //{Algoritma}
    public Programmer(String nama){
        super(nama);
        this.bonus = 450000;
    }
    
    @Override
    public void tampilData() {
        System.out.println("Nama : " + this.nama + ", Gaji pokok : " + this.gajiPokok);
        System.out.println("Bonus : " + this.bonus);
    }
    
}
