package com.ylk.webservices;

import javax.jws.WebService;

@WebService
public class ServerImpl implements Server {
    @Override
    public double add(double a, double b) {
        System.out.println("add");
        return a+b;
    }
}
