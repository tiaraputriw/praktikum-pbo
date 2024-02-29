//NamaFile: Mpp.java
//Deskripsi: Main class mpp untuk membuat objek dan menampilkan hasil dari method yang sudah dibuat
//Nama - NIM: Tiara Putri Wibowo - 24060122120026
//Tanggal: 29 Februari 2024

public class Mpp {
    public static void main(String[] args) {
        Penjual A = new Penjual("Tiara", "Jl.Serayu","0882005");
        Penjual B = new Penjual();
        Produk K = new Produk("Beauty", 15000, 10, "Krim Kecantikan", B);

        B.setNamaPenjual("Dio");
        B.setAlmtPenjual("Jl.kenangan");
        B.setNTelpPenjual("085172903");
        K.setStok(15);

        System.out.println("Nama Penjual A: " + A.getNamaPenjual());
        System.out.println("Alamat Penjual A: " + A.getAlmtPenjual());
        System.out.println("Nomor Telepon Penjual A: " + A.getNTlepPenjual());
        System.out.println("Penjual B: " + B.getInformasiPenjual());
        System.out.println("Stok Produk K: " + K.getStok());
        System.out.println("Produk K: " + K.getInformasiP());
        System.out.println("Penjual Produk K: " + K.get_penjual());
    }
}
