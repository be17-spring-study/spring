package com.example.demo.lecture;

import lombok.Builder;
import lombok.Getter;

public class LectureDto {
    @Getter
    @Builder
    public static class Lecture{
        private Integer idx;
        private String title;
        private String description;
        private Integer runtime;
        private Integer price;

        public static LectureDto.Lecture from(LectureEntity entity){
            LectureDto.Lecture dto = Lecture.builder()
                    .idx(entity.getIdx())
                    .title(entity.getTitle())
                    .description(entity.getDedcription())
                    .runtime(entity.getRuntime())
                    .price(entity.getPrice())
                    .build();

            return dto;
        }
    }
    @Getter
    public static class Register{
        private String title;
        private String description;
        private Integer runtime;
        private Integer price;

        public LectureEntity toEntity(){
            LectureEneity entity = LectureEntity.builder()
                    .title(title)
                    .description(description)
                    .runtime(runtime)
                    .price(price)
                    .build();
        }
    }
}
