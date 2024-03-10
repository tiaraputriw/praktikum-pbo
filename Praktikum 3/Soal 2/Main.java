public class Main {
    public static void main(String[] args) {
        Pembeli A = new Pembeli("Aminah");
        Obat a = new Obat("Paracetamol");
        Obat b = new Obat("Promag");
        Obat c = new Obat("Vitamin C");
        Obat d = new Obat("Antibiotik");
        Obat e = new Obat("Obat Flu");
        Obat f = new Obat("Obat Batuk");

        f.setTersedia(false);
        try {
            A.beliObat(b);
            A.beliObat(a);
            A.beliObat(c);
            A.beliObat(f);
            A.beliObat(d);
            A.beliObat(e);
            System.out.println("Jumlah Obat dalam keranjang: " + A.getJumlahObat());
        } catch (BatasObatPenuhException bope) {
            System.out.println("Mohon maaf " + bope.getMessage());
        } catch (ObatTidakTersediaException otte) {
            System.out.println("Mohon maaf " + otte.getMessage());
        }
    }
}
