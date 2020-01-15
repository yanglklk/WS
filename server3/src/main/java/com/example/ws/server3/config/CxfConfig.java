package com.example.ws.server3.config;

import com.example.ws.server3.services.Impl.UserServicesImpl;
import com.example.ws.server3.sever.ServerImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class CxfConfig {
    @Autowired
    private Bus bus;

    @Autowired
    private ServerImpl server;

    @Autowired
    private UserServicesImpl userServices;

    @Bean
    public Endpoint endpoint(){
        EndpointImpl endpoint=new EndpointImpl(bus,server);
        endpoint.publish("/Server");
        return endpoint;
    }

    @Bean
    public Endpoint endpoint1(){
        EndpointImpl endpoint=new EndpointImpl(bus,userServices);
        endpoint.publish("/UserInfoServices");
        return endpoint;
    }

}
