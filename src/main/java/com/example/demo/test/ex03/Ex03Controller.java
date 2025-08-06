package com.example.demo.test.ex03;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex03")
public class Ex03Controller {

    @GetMapping("/test01")
    public String test01() {
        return "test01";
    }

    @GetMapping("/test02")
    public Ex03Dto.Res test02() {
        Ex03Dto.Res response = new Ex03Dto.Res();
        response.setData01(10);
        response.setData02(10);
        return response;
    }

    @GetMapping("/test03")
    public ResponseEntity test03() {
        Ex03Dto.Res response = new Ex03Dto.Res();
        response.setData01(10);
        response.setData02(20);

        return ResponseEntity.status(200).body(response);
    }
}
