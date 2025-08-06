package com.example.demo.menu;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MenuEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idx;

    private String name;
    private int price;
    private int kcal;
}
