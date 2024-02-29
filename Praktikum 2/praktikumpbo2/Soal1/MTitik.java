//Nama file : MTitik.java
//Deskripsi : Main Class titik dan garis untuk menghitung, menampilkan, atau mengatur suatu tindakan (method) yang sudah dibuat
//Nama - NIM : Tiara Putri Wibowo - 24060122120026
//Tanggal : 26 Februari 2024

public class MTitik {
    public static void main(String[] args) {
    
    Titik t1 = new Titik(2,3);
    Titik t2 = new Titik();
    Titik t3 = new Titik(5,4);
    Garis X = new Garis();
    Garis Y = new Garis(t1, t2);
    Kubus kubus1 = new Kubus(X);

    t2.setAbsis(4);
    t2.setOrdinat(8);
    X.setTitikAwal(t3);
    X.setTitikAkhir(t1);

    System.out.println("Titik t1 dengan enkapsulasi : "+t1.getAbsis() + " , " + t1.getOrdinat());
    System.out.println("Jarak titik t1 dengan titik pusat : "+t1.getJarakPusat());

    t1.refleksiX();
    System.out.println("RefleksiX terhadap titik t1: " + t1.getKoordinat());
    t1.refleksiY();
    System.out.println("RefleksiY terhadap titik t1: " +t1.getKoordinat());
    System.out.println("Titik hasil refleksi terhadap sumbu X: " + t1.getRefleksiX().getKoordinat());
    System.out.println("Titik hasil refleksi terhadap sumbu Y: " + t1.getRefleksiY().getKoordinat());

    System.out.println("Garis X memiliki titik: " + X.getTitikAwal().getKoordinat() + " , " + X.getTitikAkhir().getKoordinat());
    System.out.println("Garis Y memiliki titik: " + Y.getTitikAwal().getKoordinat() + " , " + Y.getTitikAkhir().getKoordinat());
    System.out.println("Panjang garis X: " + X.getPanjang());
    System.out.println("Gradien garis Y: " + Y.getGradien());
    System.out.println("Garis X refleksi dengan sumbu Y: " + Y.getRefleksiY().getTitikAwal().getKoordinat() + " , " + Y.getRefleksiY().getTitikAkhir().getKoordinat());
    System.out.println("Apakah garis X tegak lurus dengan garis Y: " + X.isTegakLurus(Y));
    System.out.println("Volume dari kubus A: " + kubus1.hitungVolume());
    System.out.println("Luas Permukaan dari kubus A: " + kubus1.hitungLuasPermukaan());
    }
}
