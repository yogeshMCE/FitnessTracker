package View;

public class Response {
    boolean status;
    Object data;

    public Response(boolean status, Object data) {
        this.status = status;
        this.data = data;
    }
}
