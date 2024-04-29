/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanVeryEasy;

/**
 *
 * @author ASUS
 */
public class Senjata {
    //{Kamus}
    private String bunyi;
    private int peluru;
    
    //{Algoritma}
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.peluru = 0;
    }
    
    public String getBunyi(){
        return this.bunyi;
    }
    
    public int getPeluru(){
        return this.peluru;
    }
    
    public void menembak(){
        System.out.println(bunyi);
        int sisa = peluru - 1;
        System.out.println("Sisa Peluru : " + sisa);
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}
