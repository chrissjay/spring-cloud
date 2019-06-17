package com.cloud.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LoginService {

    @Autowired
    RestTemplate restTemplate;

    //注解指定发生错误时的回调方法
    @HystrixCommand(fallbackMethod = "loginFallBack")
    public String loginService() {
        //Get请求调用服务，restTemplate被@LoadBalanced注解标记，Get方法会自动进行负载均衡
        return restTemplate.getForObject("http://login", String.class);
    }

    public String  loginFallBack() {
        return "Error occurred ！";
    }

}
