package com.example.demo.board;

public class BoardDto {

    public static class Create {
        private String name;
        private String contents;

        @Override
        public String toString() {
            return "Create{" +
                    "name='" + name + '\'' +
                    ", contents='" + contents + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getContents() {
            return contents;
        }

        public void setContents(String contents) {
            this.contents = contents;
        }
    }

    public static class Board {
        private Long id;
        private String name;
        private String contents;

        @Override
        public String toString() {
            return "Board{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", contents='" + contents + '\'' +
                    '}';
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getContents() {
            return contents;
        }

        public void setContents(String contents) {
            this.contents = contents;
        }
    }
}
