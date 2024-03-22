public class RAkun extends UserRegistrasi{
    public RAkun(String username, String name, String phone_number, String email, String password){
        super(username, name, phone_number, email, password);
    }

    public boolean register(){
        RValidasi valid = new RValidasi();
        return valid.validate(username, name, phone_number, email, password);
    }
}
