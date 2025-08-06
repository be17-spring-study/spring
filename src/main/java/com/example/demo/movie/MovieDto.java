package com.example.demo.movie;

public class MovieDto {
    public static class Movie{
        private Integer idx;
        private String title;
        private String description;
        public Integer runtime;

        public static MovieDto.Movie from(MovieEntity entity){
            MovieDto.Movie dto  = new MovieDto.Student();
            dto.setIdx(entity.getIdx());
            dto.setTitle(entity.getTitle());
            dto.setDescription(entity.getDescription());
            dto.setRuntime(entity.getRuntime());

            return dto;
        }

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

        public Integer getRuntime() {
            return runtime;
        }

        public void setRuntime(Integer runtime) {
            this.runtime = runtime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
    public static class Register{
        private String title;
        private String description;
        private Integer runtime;

        public MovieEntity toEntity(){
            MovieEntity entity = new MovieEntity();
            entity.setTitle(title);
            entity.setTitle(description);
            entity.setTitle(runtime);
            return entity;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getRuntime() {
            return runtime;
        }

        public void setRuntime(Integer runtime) {
            this.runtime = runtime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

}
