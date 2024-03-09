public class KeranjangObat {
    private String[] keranjang;
    private int count;

    public KeranjangObat() {
        keranjang = new String[5];
        count = 0;
    }

    public void tambahObat(String obat){
        assert(count < keranjang.length):"Keranjang sudah penuh!";
        keranjang[count] = obat;
        count++;
    }

    public void tampilkanObat(){
        for (int i = 0; i < keranjang.length; i++){
            System.out.println(keranjang[i]);
        }
    }
}