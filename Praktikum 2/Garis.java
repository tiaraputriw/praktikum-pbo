//Nama file : Garis.java
//Deskripsi : Class Garis dengan atribut titik awal dan titik akhir untuk menghitung, menampilkan, atau mengatur suatu tindakan (method)
//Nama - NIM : Tiara Putri Wibowo - 24060122120026
//Tanggal : 26 Februari 2024

public class Garis {
    //atribut
    private Titik titikAwal;
    private Titik titikAkhir;

    //konstruktor
    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public Garis() {
        this(new Titik(), new Titik());
    }

    //method
    //prosedur untuk mengatur nilai atribut titik awal dengan nilai yang baru
    public void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }

    //prosedur untuk mengatur nilai atribut titik akhir dengan nilai yang baru
    public void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }
    
    //fungsi untuk mendapatkan nilai atribut titik awal 
    public Titik getTitikAwal(){
        return this.titikAwal;
    }

    //fungsi untuk mendapatkan nilai atribut titik akhir
    public Titik getTitikAkhir() {
        return this.titikAkhir;
    }

    //fungsi untuk mendapatkan nilai panjang dari sebuah garis yang memiliki titik awal dan titik akhir
    public double getPanjang(){
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2) + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    //fungsi untuk mendapatkan nilai gradien dari sebuah garis yang memiliki titik awal dan titik akhir
    public double getGradien(){
        return ((titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis())); 
    }

    //fungsi untuk mendapatkan nilai pencerminan sebuah garis
    public Garis getRefleksiY(){
        Titik a = titikAwal.getRefleksiY();
        Titik b = titikAkhir.getRefleksiY();
        Garis c = new Garis(a, b);

        return c;
    }

    //fungsi untuk mengecek apakah garis yang dibuat tegak lurus dengan garis g
    public boolean isTegakLurus(Garis G){
        return Math.abs(this.getGradien() * G.getGradien()) == 1;
    }
}