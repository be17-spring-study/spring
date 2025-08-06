package com.example.demo.test.ex04;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex04")
public class Ex04Controller {

    private final Ex04Service ex04Service;

    public Ex04Controller(Ex04Service ex04Service) {
        this.ex04Service = ex04Service;
    }

    @GetMapping("/test01")
    public String test01(String str01, String str02) {
        System.out.println("str01 = " + str01);
        System.out.println("str02 = " + str02);

        ex04Service.save(str01, str02);

        return "test01 " + str01 + " " + str02;
    }
}
