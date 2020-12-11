package com.example.customer.controller;

import com.example.customer.entitiy.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderController {
    public static  final  String  URL="http://localhost:8010";
    @Resource
    private RestTemplate restTemplate;
    @GetMapping("customer/getall/getUser")
    public String  getall(){
        return restTemplate.getForObject(URL+"getall/getUser",String.class);
    }
}
