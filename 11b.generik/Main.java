public class Main {
    public static void main(String[] args) {
        //kamus
            Ulat K;
            Data<Kupu> anu;
        //algoritma
            K = new Ulat();
            anu = new Data<>();
            anu.setIsi(K);
            anu.getIsi().gerak();
            anu.setIsi(new Kepompong());
            anu.getIsi().gerak();
            anu.setIsi(new KupuDewasa());
            anu.getIsi().gerak();
    }
}
