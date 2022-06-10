package co.edu.unbosque.resttaller4.dtos;

public class Fcoins {
    private String email;
    private String password;
    private int fcoins;
    public Fcoins(String email, String password, int fcoins) {
        this.email = email;
        this.password = password;
        this.fcoins = fcoins;
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

    public int getFcoins() {
        return fcoins;
    }

    public void setFcoins(int fcoins) {
        this.fcoins = fcoins;
    }
}
