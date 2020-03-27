package com.tcc.demo.redpacket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients ("com.tcc")
public class RedpacketApplication {

	public static void main(String[] args) {
        SpringApplication.run(RedpacketApplication.class, args);
    }
}
