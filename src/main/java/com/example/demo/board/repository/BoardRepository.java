package com.example.demo.board.repository;

import com.example.demo.board.BoardDto;

import java.util.List;

public interface BoardRepository {

    void save(BoardDto.Create board);

    BoardDto.Board findById(Long id);

    List<BoardDto.Board> findAll();
}
