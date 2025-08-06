package com.example.demo.test.ex02;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex02Controller {

    @RequestMapping(method = RequestMethod.GET, path = "/test01")
    public String test01(String str01, Integer num01) {
        System.out.println(str01);
        System.out.println(num01);

        return "test01 " + str01 + " " + num01;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/test02")
    public String test02(Ex02Dto.Test02 data) {
        System.out.println(data.str01);
        System.out.println(data.num01);

        return "test02 " + data.str01 + " " + data.num01;
    }
}
