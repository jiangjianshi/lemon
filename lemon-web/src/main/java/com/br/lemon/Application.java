package com.br.lemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by jiangjianshi on 18/12/6.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.br.lemon"})
@ComponentScan("com.br.lemon")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
