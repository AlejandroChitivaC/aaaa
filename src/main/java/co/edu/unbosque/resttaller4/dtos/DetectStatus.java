package co.edu.unbosque.resttaller4.dtos;
public class DetectStatus {
    private int status;
    private String message;

    public DetectStatus(int status, String message) {
        this.status = status;
        this.message = message;
    }
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}