public class Pembeli {
    private String nama;
    private Obat[] keranjangObat;
    private int jumlahObat;

    public Pembeli(String nama){
        this.nama = nama;
        keranjangObat = new Obat[5];
        jumlahObat = 0;
    }

    public String getNama(){
        return nama;
    }

    public Obat[] getKeranjangObat(){
        return keranjangObat;
    }

    public int getJumlahObat(){
        return jumlahObat;
    }

    public void beliObat(Obat obat) throws BatasObatPenuhException, ObatTidakTersediaException{
        if (jumlahObat >= keranjangObat.length) {
            throw new BatasObatPenuhException("Keranjang Obat Sudah Penuh");
        }
        if (obat.isTersedia() == false) {
            throw new ObatTidakTersediaException("Obat Tidak Tersedia");
        }
        obat.setTersedia(false);
        keranjangObat[jumlahObat] = obat;
        jumlahObat++;
    }
}
