package com.example.springconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DbConfigController {

    @Value("${db.host}")
    private String host;

    @Value("${db.name}")
    private String name;

    @Value("${db.pass}")
    private String pass;


    @GetMapping("/config")
    public String getConfigs() {
        return "Hi there, I am from github  " +  this.name + "  " + this.host + " " + this.pass;
    }
}
