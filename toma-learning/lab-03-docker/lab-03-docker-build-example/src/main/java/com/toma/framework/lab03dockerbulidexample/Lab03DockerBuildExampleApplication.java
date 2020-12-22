package com.toma.framework.lab03dockerbulidexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Lab03DockerBuildExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(Lab03DockerBuildExampleApplication.class, args);
    }
    @GetMapping("/syaHello")
    public String sayHello(String param){
        return "syaHello:"+ param;
    }
}
