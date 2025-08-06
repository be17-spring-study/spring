package com.example.demo.product;

import org.springframework.data.jpa.repository.JpaRepository;// 스프링에저 jpa 편하게 쓸 수 있게 해주는거
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <ProductTT, Integer> {

}
