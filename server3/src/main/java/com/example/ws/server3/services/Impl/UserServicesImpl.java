package com.example.ws.server3.services.Impl;

import com.example.ws.server3.services.UserInfoServices;
import com.example.ws.server3.model.UserInfo;
import com.example.ws.server3.repository.UserInfoRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.Optional;

@WebService(name = "JPAServer",
        targetNamespace = "http://services.server3.ws.example.com/",
        endpointInterface = "com.example.ws.server3.services.UserInfoServices")
@Service
public class UserServicesImpl implements UserInfoServices {
    @Autowired
    private UserInfoRep userInfoRep;

    @Override
    public UserInfo getUserInfo(Long id) {
        Optional<UserInfo> byId = userInfoRep.findById(id);
        return byId.get();
    }
}
