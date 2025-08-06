package com.example.demo.menu;

import com.example.demo.test.ex03.Ex03Dto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/menu")
public class MenuController {
    private final MenuService menuService;

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody MenuDto.Register dto) {
        menuService.register(dto);
        return ResponseEntity.status(200).body("등록 성공");

    }
    @GetMapping("/list")
    public ResponseEntity list() {
        List<MenuDto.Menu> response = menuService.list();

        return ResponseEntity.status(200).body(response);
    }

    @GetMapping("/read")
    public ResponseEntity read(Integer idx) {
        MenuDto.Menu response = menuService.read(idx);

        return ResponseEntity.status(200).body(response);
    }
}
