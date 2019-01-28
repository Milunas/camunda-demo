package demo.infrastructure.error;

public class ErrorDetail {

    private String message;

    public ErrorDetail(){

    }

    public ErrorDetail(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ErrorDetail{" +
                "message='" + message + '\'' +
                '}';
    }
}
