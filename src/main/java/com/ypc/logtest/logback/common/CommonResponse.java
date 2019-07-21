package com.ypc.logtest.logback.common;

/**
 * @Author: ypcfly
 * @Date: 19-7-18 21:59
 * @Description:
 */
public class CommonResponse<T> {

    private String code;

    private String message;

    private T result;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public CommonResponse() {
    }

    public CommonResponse(T result) {
        this.result = result;
    }

    public CommonResponse(String code, String message, T result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }
}
