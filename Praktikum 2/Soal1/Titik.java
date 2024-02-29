//Nama file : Titik.java
//Deskripsi : Class Titik dengan atribut absis dan ordinat untuk menghitung, menampilkan, atau mengatur suatu tindakan (method)
//Nama - NIM : Tiara Putri Wibowo - 24060122120026
//Tanggal : 26 Februari 2024

public class Titik {
    //atribut
    private double absis;
    private double ordinat;
    //static int numberOfPoints;

    //konstruktor
    //membuat objek titik dengan inisialisasi nilai absis dan ordinat
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
    }

    public Titik(){
        this(0, 0);
    }

    //method
    //fungsi selektor untuk mendapatkan nilai atribut ordinat
    public double getOrdinat(){
        return this.ordinat;
    }

    //fungsi selektor untuk mendapatkan nilai atribut absis
    public double getAbsis(){
        return this.absis;
    }

    //prosedur untuk mengeset nilai atribut absis dengan nilai yang baru
    public void setAbsis(double absis){
        this.absis = absis;
    }

    //prosedur untuk mengeset nilai atribut ordinat dengan nilai yang baru
    public void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }

    //fungsi untuk menghitung jarak sebuah titik dengan titik pusat(0,0)
    public double getJarakPusat(){
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    //prosedur untuk melakukan pencerminan titik terhadap sumbu X
    public void refleksiX(){
        this.ordinat = -ordinat;
    }

    //prosedur untuk melakukan pencerminan titik terhadap sumbu Y
    public void refleksiY(){
        this.absis = -absis;
    }

    //fungsi untuk menghasilkan titik baru yang merupakan hasil pencerminan terhadap sumbu X
    public Titik getRefleksiX(){
        Titik tr = new Titik(absis, ordinat);
        tr.refleksiX();
        return tr;
    }

    //fungsi untuk menghasilkan titik baru yang merupakan hasil pencerminan terhadap sumbu Y
    public Titik getRefleksiY(){
        Titik tr = new Titik(absis, ordinat);
        tr.refleksiY();
        return tr;
    }

    public String getKoordinat(){
        return "(" + this.absis + ", " + this.ordinat + ")";
    }

    //kesimpulan : setiap access modifier memiliki batasan masing-masing. Untuk public berarti method atau atribut dapat diakses diluar class tersebut ataupun di luar package sedangkan untuk private hanya bisa diakses oleh class tersebut dan default hanya bisa diakses di dalam package yang sama. Dan beberapa method ataupun atribut tidak selalunya harus public atau private, dapat diganti sesuai kebutuhan dan permintaan.
}