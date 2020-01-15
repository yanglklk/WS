package com.example.ws.server3.sever;

import javax.jws.WebService;


@WebService(name = "JPAServer",
        targetNamespace = "http://sever.server3.ws.example.com/")
public interface TestJPA {
    String test();
}
