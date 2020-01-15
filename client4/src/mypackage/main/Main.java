package mypackage.main;

import com.example.ws.server3.services.JPAServer;
import com.example.ws.server3.services.UserInfo;
import com.example.ws.server3.services.UserServicesImplService;


public class Main {
    public static void main(String[] args) {
        UserServicesImplService userServicesImplService=new UserServicesImplService();
        JPAServer port = userServicesImplService.getPort(JPAServer.class);
        UserInfo userInfo=port.getUserInfo((long) 5);
        System.out.println(userInfo.getName());

    }

}
