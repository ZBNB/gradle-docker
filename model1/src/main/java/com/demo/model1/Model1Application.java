package com.demo.model1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desprication:
 * @Author: LENNON
 * @Date: created in 15:04 2019/7/24
 * @Modify By:
 */
@SpringBootApplication
@RestController
public class Model1Application {
    public static void main(String[] args) {
        SpringApplication.run(Model1Application.class, args);
    }

    @GetMapping(value = "/testGet")
    public String sendTest() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "success";
    }
}
