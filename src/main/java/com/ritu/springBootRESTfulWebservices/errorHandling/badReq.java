package com.ritu.springBootRESTfulWebservices.errorHandling;


public class badReq extends RuntimeException
{
    private int status;
    private String message;

    public badReq() {
        super();
    }

    public badReq(int status, String message) {
        super();
        this.status = status;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "badReq{" +
                "status=" + status +
                "message='" + message + '\'' +
                '}';
    }
}

