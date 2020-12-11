package com.exmaple.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.exmaple.provider.mapper")
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication app=new SpringApplication(ProviderApplication.class);
        app.setBannerMode(Banner.Mode.OFF);// 关闭启动Banner
        app.run(args);
        System.out.println("Provider start completed.........");
    }

}