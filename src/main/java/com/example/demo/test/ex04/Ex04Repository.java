package com.example.demo.test.ex04;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Ex04Repository {

    private final JdbcTemplate jdbcTemplate;

    public Ex04Repository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(String str01, String str02) {
        String sql = "insert into test (str01,str02) values(?,?)";
        jdbcTemplate.update(sql, str01, str02);
    }
}
