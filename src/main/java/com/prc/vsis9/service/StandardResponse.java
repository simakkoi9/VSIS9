package com.prc.vsis9.service;


public class StandardResponse {
    private final String status;
    private final Integer code;
    public StandardResponse(String status, Integer code) {
        this.status = status;
        this.code = code;
    }
    public String getStatus() {
        return status;
    }
    public Integer getCode() {
        return code;
    }
}
