package com.tcc.demo.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@Slf4j
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients (basePackages ="com.tcc.demo.order.feign")
public class OrderApplication {

	public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
        log.info("OrderApplication started success");
    }
}
