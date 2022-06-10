package co.edu.unbosque.resttaller4.dtos;

public class Collections {
    private String email;
    private String username;
    private String coleccion;

    public Collections() {

    }

    public Collections(String email, String username, String coleccion) {
        this.email = email;
        this.username = username;
        this.coleccion = coleccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    @Override
    public String toString() {
        return "Coleccion{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", coleccion='" + coleccion + '\'' +
                '}';
    }
}
