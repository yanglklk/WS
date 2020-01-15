package example;

import mypackage.HelloWorldService;
import mypackage.HelloWorldServiceLocator;
import mypackage.HelloWorld_PortType;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

import javax.sound.midi.Soundbank;
import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;

public class HelloWorldClient {
//  public static void main(String[] argv) {
//    try {
//      HelloWorldServiceLocator locator = new HelloWorldServiceLocator();
//      HelloWorld_PortType helloWorld_portType=locator.getHelloWorld();
//      double result=helloWorld_portType.add(1.3,3.4);
//      System.out.println(result);
//    } catch (javax.xml.rpc.ServiceException ex) {
//      ex.printStackTrace();
//    } catch (java.rmi.RemoteException ex) {
//      ex.printStackTrace();
//    }
//  }
  public static void main(String[] args) {
    String url="http://localhost:8080/services1_war_exploded/services/HelloWorld?wsdl";
    String method="add";
    Object[] params=new Object[]{2.4,5.7};
    HelloWorldClient client=new HelloWorldClient();
    System.out.println(client.callMethood(url,method,params));
  }
  public String callMethood(String url,String method, Object[] args){
    String result=null;
    Call rpcCall=null;
    try {
      Service service=new Service();
      rpcCall= (Call) service.createCall();
      rpcCall.setTargetEndpointAddress(new java.net.URL(url));
      rpcCall.setOperationName(method);
      double rel=(double) rpcCall.invoke(args);
      result=String.valueOf(rel);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return result;
  }
}
