//NamaFile: Produk.java
//Deskripsi: Class produk memiliki 4 atribut (nama, harga, stok, deskripsi) dan memiliki method setter serta getter untuk menampilkan informasi dan mengubah(set) informasi produk
//Nama - NIM: Tiara Putri Wibowo - 24060122120026
//Tanggal: 29 Februari 2024

public class Produk {
    //atribut
    private String namaP;
    private int harga;
    private int stok;
    private String deskripsi;
    private Penjual penjual; //Penambahan atribut penjual

    //konstruktor
    public Produk(String namaP, int harga, int stok, String deskripsi, Penjual penjual){
        this.namaP = namaP;
        this.harga = harga;
        this.stok = stok;
        this.deskripsi = deskripsi;
        this.penjual = penjual; //inisialisasi objek penjual
    }

    public Produk(){
        this("xx", 0, 0, "", new Penjual());
    }

    //method
    //prosedur untuk mengeset nama produk
    public void setNamaP(String namaP){
        this.namaP = namaP;
    }

    //prosedur untuk mengeset harga produk
    public void setHarga(int harga){
        this.harga = harga;
    }

    //prosedur untuk mengeset stok produk
    public void setStok(int stok){
        this.stok = stok;
    }

    //prosedur untuk mengeset deskripsi produk
    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }

    //function untuk mengembalikan nilai nama produk
    public String getNamaP(){
        return this.namaP;
    }

    //function untuk mengembalikan nilai harga produk
    public int getHarga(){
        return this.harga;
    }

    //function untuk mengembalikan nilai nama produk
    public int getStok(){
        return this.stok;
    }

    //function untuk mengembalikan nilai nama produk
    public String getDeskripsi(){
        return this.deskripsi;
    }

    //function untuk mendapatkan informasi produk
    public String getInformasiP(){
        return "[Nama: "+ this.namaP + ", Harga: "+ this.harga +", Stok: "+ this.stok + ", Deskripsi: "+ this.deskripsi +"]";
    }

    //function untuk mendapatkan informasi penjual
    public String get_penjual(){
        return penjual.getInformasiPenjual();
    }
}
