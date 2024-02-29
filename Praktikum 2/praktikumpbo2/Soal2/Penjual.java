//NamaFile: Penjual.java
//Deskripsi: Class penjual memiliki 3 atribut (nama, alamat, nomor telepon) dan memiliki method setter serta getter untuk menampilkan informasi dan mengubah(set) informasi penjual
//Nama - NIM: Tiara Putri Wibowo - 24060122120026
//Tanggal: 29 Februari 2024

public class Penjual {
    //atribut
    private String nama;
    private String alamat;
    private String notelp;

    //konstruktor
    public Penjual(String nama, String alamat, String notelp){
        this.nama = nama;
        this.alamat = alamat;
        this.notelp = notelp;
    }

    public Penjual(){
        this("xx", "Jl.xx", "08xx");
    }

    //method
    //prosedur untuk mengubah atau mengeset nama penjual
    public void setNamaPenjual(String nama){
        this.nama = nama;
    }

    //prosedur untuk mengubah atau mengeset alamat penjual
    public void setAlmtPenjual(String alamat){
        this.alamat = alamat;
    }

    //prosedur untuk mengubah atau mengeset nomor telepon penjual
    public void setNTelpPenjual(String notelp){
        this.notelp = notelp;
    }

    //function untuk mengembalikan nilai nama penjual
    public String getNamaPenjual(){
        return this.nama;
    } 

    //function untuk mengembalikan nilai alamat penjual
    public String getAlmtPenjual(){
        return this.alamat;
    }

    //function untuk mengembalikan nilai nomor telepon penjual
    public String getNTlepPenjual(){
        return this.notelp;
    }

    //function untuk mengembalikan informasi penjual (kumpulan ketiga atribut)
    public String getInformasiPenjual(){
        return "[Nama: "+ this.nama + ", Alamat: " + this.alamat + ", Nomor Telepon: " + this.notelp + "]";
    }
}
