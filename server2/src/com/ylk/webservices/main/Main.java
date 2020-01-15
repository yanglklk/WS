package com.ylk.webservices.main;

import com.ylk.webservices.ServerImpl;

import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/calculate",new ServerImpl());
        System.out.println("发布成功");
    }
}
