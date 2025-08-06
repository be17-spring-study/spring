package com.example.demo.board;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    // 저장
    public void register(BoardDto.Create dto) {
        boardRepository.save(dto.toEntity());
    }

    // 단건 조회
    public BoardDto.Board read(Integer id) {
        Optional<BoardEntity> result = boardRepository.findById(id);

        if (result.isPresent()){
            BoardEntity entity = result.get();

            return BoardDto.Board.from(entity);
        }

        return null;
    }

    // 전체 조회
    public List<BoardDto.Board> list() {
        List<BoardEntity> result = boardRepository.findAll();
        return result.stream().map(BoardDto.Board::from).toList();
    }
}
