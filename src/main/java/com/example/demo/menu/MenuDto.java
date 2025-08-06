package com.example.demo.menu;

import lombok.Builder;
import lombok.Getter;

public class MenuDto {

    @Builder
    @Getter
    public static class Menu {
        private int idx;
        private String name;
        private int price;
        private int kcal;

        public static MenuDto.Menu from(MenuEntity entity) {
            return Menu.builder()
                    .idx(entity.getIdx())
                    .name(entity.getName())
                    .price(entity.getPrice())
                    .kcal(entity.getKcal())
                    .build();
        }
    }

    @Builder
    @Getter
    public static class Register {
        private String name;
        private int price;
        private int kcal;

        public MenuEntity toEntity() {
            return MenuEntity.builder()
                    .name(name)
                    .price(price)
                    .kcal(kcal)
                    .build();
        }
    }
}
