package com.example.ws.server3.services;

import com.example.ws.server3.model.UserInfo;

import javax.jws.WebService;

@WebService(name = "JPAServer",
        targetNamespace = "http://services.server3.ws.example.com/")
public interface UserInfoServices  {
    UserInfo getUserInfo(Long id);

}
