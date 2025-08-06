package com.example.demo.test;

import org.springframework.stereotype.Repository;

@Repository
public class TestRepository {
    public TestRepository() {
        System.out.println("레포지토리 객체 생성됨");
    }
}
