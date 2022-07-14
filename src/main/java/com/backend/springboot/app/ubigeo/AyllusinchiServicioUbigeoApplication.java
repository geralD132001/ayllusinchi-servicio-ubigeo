package com.backend.springboot.app.ubigeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.backend.springboot.app.commons.ubigeo.models.entity"})
public class AyllusinchiServicioUbigeoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AyllusinchiServicioUbigeoApplication.class, args);
    }

}
