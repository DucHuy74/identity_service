package vn.proj.spring.identity_service.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL) //khai bao cho json khi -> api, field nao null se ko kem vao trong json
public class ApiResponse <T>{
    private int code = 1000;
    private String message;
    private T result;

    public int getCode() {
        return code;
    }

    public void setCode(int codel) {
        this.code = code;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
