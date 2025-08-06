package com.example.demo.product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ProductDto {
    public static class Product {
        private Integer idx;
        private String name;
        private String description;
        private Integer price;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getIdx() {
            return idx;
        }

        public void setIdx(Integer idx) {
            this.idx = idx;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public static ProductDto.Product from(ProductTT entity) {
            ProductDto.Product dto = new ProductDto.Product();
            dto.setIdx(entity.getId());
            dto.setName(entity.getName());
            dto.setDescription(entity.getDescription());
            dto.setPrice(entity.getPrice());
            return dto;
        }
    }

    public static class Register {
        private String name;
        private String description;
        private Integer price;

        public ProductTT toEntity() {
            ProductTT entity = new ProductTT();
            entity.setName(name);
            entity.setDescription(description);
            entity.setPrice(price);
            return entity;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

    }
}

