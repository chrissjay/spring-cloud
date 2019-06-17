package com.cloud.login1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Login1Application {

    public static void main(String[] args) {
        SpringApplication.run(Login1Application.class, args);
    }

}
