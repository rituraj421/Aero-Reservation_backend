package com.ritu.springBootRESTfulWebservices.errorHandling;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class badReqResponse
{
    private int status;
    private String message;

    public badReqResponse(badReq ex)
    {
        this.status = ex.getStatus();
        this.message = ex.getMessage();
    }

    public badReqResponse(int status, String message)
    {
        this.status = status;
        this.message = message;
    }
}
