package co.edu.unbosque.resttaller4.dtos;

public class NewUser {
    private String fullname;
    private String username;
    private String email;
    private String password;
    private String rpass;
    private String rol;
    private int fcoins;
    public NewUser(String fullname,String username,String email, String password, String rpass, String rol,int fcoins){
        this.fullname=fullname;
        this.username = username;
        this.email = email;
        this.password = password;
        this.rpass=rpass;
        this.rol = rol;
        this.fcoins=fcoins;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRpass() {
        return rpass;
    }

    public void setRpass(String rpass) {
        this.rpass = rpass;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getFcoins() {
        return fcoins;
    }

    public void setFcoins(int fcoins) {
        this.fcoins = fcoins;
    }
}
