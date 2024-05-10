package com.kirou.common;

public class Result<T> {

    private int code;
    private String message;
    private T data;

    public static Result success() {
        return new Result(ResultCode.SUCCESS);
    }

    public static <T> Result<T> success(T data) {
        return new Result<T>(ResultCode.SUCCESS, data);
    }

    public static Result failure(ResultCode resultCode) {
        return new Result(resultCode);
    }

    public static Result failure(ResultCode resultCode, String message) {
        return new Result(resultCode, message);
    }

    private Result(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }

    private Result(ResultCode resultCode, T data) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.data = data;
    }

    private Result(ResultCode resultCode, String message) {
        this.code = resultCode.getCode();
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

}