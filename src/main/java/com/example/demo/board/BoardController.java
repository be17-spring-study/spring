package com.example.demo.board;

import com.example.demo.common.BaseResponse;
import org.springframework.http.ResponseEntity; // HTTP 응답을 커스터마이징할 수 있는 객체
import org.springframework.web.bind.annotation.GetMapping; // HTTP GET,post 요청 처리에 사용하는 어노테이션
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;//클라이언트가 보낸 JSON 데이터를 자바 객체로 자동 매핑
import org.springframework.web.bind.annotation.RestController; //내부의 메서드들은 자동으로 @ResponseBody 처리됨 → JSON 반환됨

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BoardController {

    private final BoardService BoardService;

    public BoardController(BoardService BoardService) {
        this.BoardService = BoardService;
    }

    // 저장
    @PostMapping("/products")
    public ResponseEntity<BaseResponse> BoardForm(@RequestBody BoardDto.Create create) {
        BoardService.register(create);

        Map<String, Object> map = new HashMap<>();
        map.put("msg", "게시판 등록 성공");
        return ResponseEntity.ok().body(BaseResponse.success(map));
    }

    // 단건 조회
    @GetMapping("/products")
    public ResponseEntity<BaseResponse> getBoard(Integer id) {
        BoardDto.Board findProduct = BoardService.read(id);

        return ResponseEntity.ok().body(BaseResponse.success(findProduct));
    }

    // 전체 조회
    @GetMapping("/products/list")
    public ResponseEntity<BaseResponse> getBoards() {
        List<BoardDto.Board> findProducts =  BoardService.list();

        return ResponseEntity.ok().body(BaseResponse.success(findProducts));
    }
}



