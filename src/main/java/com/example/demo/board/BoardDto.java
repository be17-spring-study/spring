package com.example.demo.board;

public class BoardDto {

    // 게시글 생성 요청용 DTO
    public static class Create {
        private String title;
        private String contents;

        public BoardEntity toEntity(){
            BoardEntity entity=new BoardEntity();
            entity.setTitle(title);
            entity.setContents(contents);
            return entity;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContents() {
            return contents;
        }

        public void setContents(String contents) {
            this.contents = contents;
        }
    }

    // 게시글 응답용 DTO
    public static class Board {
        private String title;
        private String contents;
        private int idx;

        public BoardDto.Board from(BoardEntity entity){
            BoardDto.Board dto = new BoardDto.Board();
            dto.setTitle(entity.getTitle());
            dto.setContents(entity.getContents());
            dto.setIdx(entity.getIdx());
            return dto;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContents() {
            return contents;
        }

        public void setContents(String contents) {
            this.contents = contents;
        }

        public int getIdx() {
            return idx;
        }

        public void setIdx(int idx) {
            this.idx = idx;
        }
    }
}
