public class RMain {
    public static void main(String[] args) {
        UserRegistrasi RAk = new RAkun("ara_07", "Ara", "088200571", "ara@gmail.com", "araraara");
        UserRegistrasi RG = new RGoogle("pboa1@gmail.com");
        UserRegistrasi RF = new RFacebook("ara@gmail.com");
        UserRegistrasi RAp = new RApple("pboa1@gmai.com");

        if (RAk.register()) {
            System.out.println("Registrasi dengan Akun berhasil");            
        }
        else {
            System.out.println("Registrasi dengan Akun gagal");
        }

        if (RG.register()) {
            System.out.println("Registrasi dengan Google berhasil");            
        }
        else {
            System.out.println("Registrasi dengan Google gagal");
        }
        
        if (RF.register()) {
            System.out.println("Registrasi dengan Facebook berhasil");            
        }
        else {
            System.out.println("Registrasi dengan Facebook gagal");
        }

        if (RAp.register()) {
            System.out.println("Registrasi dengan Apple berhasil");            
        }
        else {
            System.out.println("Registrasi dengan Apple gagal");
        }
    }
}
