import java.util.regex.*;

public class RValidasi implements IValidation{
    public boolean validate(String username, String name, String phone_number, String email, String password){
        // Validasi kolom username
        if (username == null || username.isEmpty()) {
            System.out.println("Username harus diisi");
            return false;
        }

        // Validasi kolom name
        if (name == null || name.isEmpty()) {
            System.out.println("Name harus diisi");
            return false;
        }
        // Validasi name hanya berupa karakter
        Pattern namePattern = Pattern.compile("[a-zA-Z]+");
        Matcher nameMatcher = namePattern.matcher(name);
        if (!nameMatcher.matches()) {
            System.out.println("Name hanya boleh berisi huruf");
            return false;
        }

        // Validasi kolom phone number
        if (phone_number == null || phone_number.isEmpty()) {
            System.out.println("Phone number harus diisi");
            return false;
        }
        // Validasi phone number hanya angka
        Pattern phonePattern = Pattern.compile("[0-9]+");
        Matcher phoneMatcher = phonePattern.matcher(phone_number);
        if (!phoneMatcher.matches()) {
            System.out.println("Phone number hanya boleh berisi angka");
            return false;
        }

        // Validasi kolom email
        if (email == null || email.isEmpty()) {
            System.out.println("Email harus diisi");
            return false;
        }

        // Validasi kolom password
        if (password == null || password.isEmpty() || password.length() < 8) {
            System.out.println("Password harus diisi dan minimal 8 karakter");
            return false;
        }
        return true;
    }
}
