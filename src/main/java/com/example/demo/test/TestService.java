package com.example.demo.test;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    public TestService() {
        System.out.println("서비스 객체 생성됨");
    }
}
