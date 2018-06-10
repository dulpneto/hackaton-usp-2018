package out;

import java.lang.reflect.Array;
import java.util.Collection;

public class APIResponse<T> {

    private int status;
    private String message;
    private T[] data;

    public APIResponse(ApiStatus status) {
        setStatus(status);
        setMessage(status.getStatus());
    }
    public APIResponse(ApiStatus status, T data) {
        setStatus(status);
        setMessage(status.getStatus());
    }

    public APIResponse(ApiStatus status, String message) {
        this(status);
        setMessage(message);
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(ApiStatus status) {
        this.status = status.getCode();
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    public void addData(T d, Class<T> c){
        this.data = (T[]) Array.newInstance(c, 1);
        this.data[0] = d;
    }
    public void addData(Collection<T> d){
        if(d != null){
            this.data = (T[]) d.toArray();
        }
    }
}
