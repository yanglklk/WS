package com.example.ws.server3.sever;

import org.springframework.stereotype.Component;

import javax.jws.WebService;

@WebService(name = "JPAServer",
        targetNamespace = "http://sever.server3.ws.example.com/",
        endpointInterface = "com.example.ws.server3.sever.TestJPA")
@Component
public class TestJpaImpl implements TestJPA {
    @Override
    public String test() {
        return "test jpa";
    }
}
