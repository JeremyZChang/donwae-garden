package com.donwae.garden.cactus.common.exception;

import com.donwae.garden.cactus.entity.enums.ErrorEnums;

/**
 * Donwae异常
 * @auther Jeremy
 * 2018/10/16 下午10:38
 */
public class DonwaeException extends RuntimeException {

    private String key;

    private String errorCode;

    private String errorMsg;

    private String data;

    public DonwaeException(ErrorEnums errorEnums){
        super(errorEnums.getErrorMessage());
        this.errorCode = errorEnums.getErrorCode();
        this.errorMsg = errorEnums.getErrorMessage();
    }

    public DonwaeException(ErrorEnums errorEnums, String key){
        super(errorEnums.getErrorMessage());
        this.key = key;
        this.errorCode = errorEnums.getErrorCode();
        this.errorMsg = errorEnums.getErrorMessage();
    }

    public DonwaeException(ErrorEnums errorEnums, String key, String data) {
        super(errorEnums.getErrorMessage());
        this.key = key;
        this.data = data;
        this.errorCode = errorEnums.getErrorCode();
        this.errorMsg = errorEnums.getErrorMessage();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
