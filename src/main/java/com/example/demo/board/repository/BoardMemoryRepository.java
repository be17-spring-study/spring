package com.example.demo.board.repository;

import com.example.demo.board.BoardDto;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Repository
public class BoardMemoryRepository implements BoardRepository {

    private static final Map<Long, BoardDto.Board> store = new HashMap<>();
    private static Long sequence = 0L;

    @Override
    public void save(BoardDto.Create board) {

        BoardDto.Board createBoard = new BoardDto.Board();

        createBoard.setId(++sequence);
        createBoard.setName(board.getName());
        createBoard.setContents(board.getContents());

        store.put(sequence, createBoard);
    }

    @Override
    public BoardDto.Board findById(Long id) {
        return store.get(id);
    }

    @Override
    public List<BoardDto.Board> findAll() {
        return store.values().stream().toList();
    }
}
