public abstract class UserRegistrasi {
    protected String username;
    protected String name;
    protected String phone_number;
    protected String email;
    protected String password;

    public UserRegistrasi(String username, String name, String phone_number, String email, String password){
        this.username = username;
        this.name = name;
        this.phone_number = phone_number;
        this.email = email;
        this.password = password;
    }

    public abstract boolean register();
}
