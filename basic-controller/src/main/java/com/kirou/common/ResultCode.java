package com.kirou.common;

public enum ResultCode {

    SUCCESS(200, "请求成功"),
    BAD_REQUEST(400, "请求参数有误"),
    UNAUTHORIZED(401, "未授权访问"),
    FORBIDDEN(403, "禁止访问"),
    NOT_FOUND(404, "请求资源不存在"),
    ILLEGAL_TOKEN(508, "非法token"),
    OTHER_CLIENTS_LOGGED_IN(512, "其他客户端登录"),
    TOKEN_EXPIRED(514, "token过期"),
    INTERNAL_SERVER_ERROR(500, "服务器内部错误");


    private int code;
    private String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}