package co.edu.unbosque.resttaller4.dtos;

public class Obra {
    private int id_obra;
    private int id_artista;
    private String colleccion;
    private String titulo;
    private long precio;
    private String email;
    public boolean enOferta=false;
    public Obra(){}
    public Obra(int id_obra,int id_artista,String colleccion,String titulo,long precio,String email,boolean enOferta){
        this.id_obra=id_obra;
        this.id_artista=id_artista;
        this.colleccion=colleccion;
        this.titulo=titulo;
        this.precio=precio;
        this.email=email;
        this.enOferta=enOferta;
    }

    public int getId_obra() {
        return id_obra;
    }

    public void setId_obra(int id_obra) {
        this.id_obra = id_obra;
    }

    public int getId_artista() {
        return id_artista;
    }

    public void setId_artista(int id_artista) {
        this.id_artista = id_artista;
    }

    public String getColleccion() {
        return colleccion;
    }

    public void setColleccion(String colleccion) {
        this.colleccion = colleccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEnOferta() {
        return enOferta;
    }

    public void setEnOferta(boolean enOferta) {
        this.enOferta = enOferta;
    }

    @Override
    public String toString() {
        return "Obra{" +
                "id_obra=" + id_obra +
                ", id_artista=" + id_artista +
                ", colleccion='" + colleccion + '\'' +
                ", titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", email='" + email + '\'' +
                ", enOferta=" + enOferta +
                '}';
    }
}
