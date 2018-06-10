package out;

public enum ApiStatus {
    OK(200, "Ok");

    private final Integer code;
    private final String status;

    ApiStatus(Integer code, String status) {
        this.code = code;
        this.status = status;

    }

    public Integer getCode() {
        return this.code;
    }

    public String getStatus() {
        return status;
    }
}
