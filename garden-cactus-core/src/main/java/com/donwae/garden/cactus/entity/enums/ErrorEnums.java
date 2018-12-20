package com.donwae.garden.cactus.entity.enums;

public enum ErrorEnums {

    SUCCESS("000000", "操作成功"),
    NONE_USER_ID("100000", "查无此用户ID"),
    NONE_USER_NAME_OR_PASSWORD("100001", "用户名或密码错误");

    private String errorCode;
    private String errorMessage;

    ErrorEnums(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
