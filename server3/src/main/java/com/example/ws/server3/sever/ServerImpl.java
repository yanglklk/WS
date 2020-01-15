package com.example.ws.server3.sever;

import org.springframework.stereotype.Component;

import javax.jws.WebService;

@WebService(name = "Server",
        targetNamespace = "http://sever.server3.ws.example.com/",
        endpointInterface = "com.example.ws.server3.sever.Server")
@Component
public class ServerImpl implements Server {
    @Override
    public double add(double a, double b) {
        System.out.println("add");
        return a+b;
    }

    @Override
    public double mul(double a, double b) {
        return a*b ;
    }
}
