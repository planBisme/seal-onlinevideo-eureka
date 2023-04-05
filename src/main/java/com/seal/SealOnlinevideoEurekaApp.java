package com.seal;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableEurekaServer
public class SealOnlinevideoEurekaApp {

    public static void main(String[] args){
        ApplicationContext app = SpringApplication.run(SealOnlinevideoEurekaApp.class, args);
    }

}
