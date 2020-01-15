package com.example.ws.server3;

import com.example.ws.server3.model.UserInfo;
import com.example.ws.server3.services.UserInfoServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.transform.Source;

@SpringBootTest
class Server3ApplicationTests {
	@Autowired
	private UserInfoServices userInfoServices;

	@Test
	void contextLoads() {
	}

	@Test
	void testJpa(){
		UserInfo userInfo=userInfoServices.getUserInfo((long) 1);
		System.out.println(userInfo.toString());
	}

}
