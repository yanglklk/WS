package com.example.ws.server3.sever;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "Server",
            targetNamespace = "http://sever.server3.ws.example.com/")
public interface Server {

    double add(double a,double b);
    double mul(double a,double b);
}
