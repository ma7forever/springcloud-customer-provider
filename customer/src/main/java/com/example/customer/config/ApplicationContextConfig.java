package com.example.customer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {
    @Bean //依赖注入
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
