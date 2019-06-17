package com.cloud.ribbon.controller;

import com.cloud.ribbon.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    LoginService service;

    @RequestMapping("/")
    public String ribbonController() {
        return service.loginService();
    }

}
