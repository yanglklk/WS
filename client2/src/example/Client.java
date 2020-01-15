package example;

import com.ylk.webservices.ServerImpl;
import com.ylk.webservices.ServerImplService;

public class Client {
    public static void main(String[] args) {
        ServerImplService serverImplService=new ServerImplService();
        ServerImpl server=serverImplService.getPort(ServerImpl.class);
        double rel=server.add(12.4,45.0);
        System.out.println(rel);
    }


}
