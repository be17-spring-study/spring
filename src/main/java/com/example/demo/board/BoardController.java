package com.example.demo.board;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boards")
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    // 게시글 작성
    @PostMapping
    public ResponseEntity<Long> boardForm(@RequestBody BoardDto.Create create) {
        System.out.println(create);
        boardService.create(create);
        return ResponseEntity.ok(null);
    }

    // 게시글 조회
    @GetMapping("/{boardId}")
    public ResponseEntity<BoardDto.Board> getBoard(@PathVariable Long boardId) {
        BoardDto.Board findBoard = boardService.get(boardId);

        return ResponseEntity.ok(findBoard);
    }

    // 게시글 목록 조회
    @GetMapping
    public ResponseEntity<List<BoardDto.Board>> getBoardList() {
        List<BoardDto.Board> findBoards = boardService.getList();

        return ResponseEntity.ok(findBoards);
    }
}
