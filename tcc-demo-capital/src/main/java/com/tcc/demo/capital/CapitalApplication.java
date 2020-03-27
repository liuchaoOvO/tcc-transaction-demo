package com.tcc.demo.capital;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@Slf4j
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients ("com.tcc")
public class CapitalApplication {

	public static void main(String[] args) {
        SpringApplication.run(CapitalApplication.class, args);
        log.info("CapitalApplication started success");
    }
}
