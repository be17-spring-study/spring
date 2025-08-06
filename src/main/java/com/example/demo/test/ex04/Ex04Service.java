package com.example.demo.test.ex04;

import org.springframework.stereotype.Service;

@Service
public class Ex04Service {

    private final Ex04Repository ex04Repository;

    public Ex04Service(Ex04Repository ex04Repository) {
        this.ex04Repository = ex04Repository;
    }

    public void save(String str01, String str02) {
        ex04Repository.save(str01, str02);
    }
}
