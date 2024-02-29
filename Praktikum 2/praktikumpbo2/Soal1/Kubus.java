//Nama file : Kubus.java
//Deskripsi : Class Kubus dengan atribut sisi untuk menghitung volume dan luas permukaan
//Nama - NIM : Tiara Putri Wibowo - 24060122120026
//Tanggal : 29 Februari 2024
public class Kubus {
    //atribut
    private Garis sisi;

    //konstruktor
    public Kubus(Garis sisi){
        this.sisi = sisi;
    }

    public Kubus(){
        this(new Garis());
    }

    //method
    //function untuk menghitung volume kubus dan mengembalikan volume kubus
    public double hitungVolume(){
        return Math.pow(sisi.getPanjang(), 3);
    }

    //function untuk menghitung luas permukaan kubus dan mengembalikan luas permukaan kubus
    public double hitungLuasPermukaan(){
        return 6 * (Math.pow(sisi.getPanjang(), 2));
    }
}
