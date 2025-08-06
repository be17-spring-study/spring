package com.example.demo.board;

import com.example.demo.board.repository.BoardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    // 게시글 생성
    public void create(BoardDto.Create create) {
        boardRepository.save(create);
    }

    // 게시글 조회
    public BoardDto.Board get(Long id) {
        return boardRepository.findById(id);
    }

    // 게시글 목록 조회
    public List<BoardDto.Board> getList() {
        return boardRepository.findAll();
    }
}
