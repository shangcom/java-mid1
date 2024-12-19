package enumeration.test.http;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUNT(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private int code;
    private String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static HttpStatus findByCode(int httpCodeInput) {
        for (HttpStatus status : values()) {
            if (status.getCode() == httpCodeInput) {
                return status;
            }
        }
        return null;
    }

    public boolean isSuccess() {
       return this.code >= 200 && this.code <= 300;
    }
}
