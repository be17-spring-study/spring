package com.example.demo.menu;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService {

    private final MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    // 저장
    public void register(MenuDto.Register dto) {
        menuRepository.save(dto.toEntity());
    }

    // 단건 조회
    public MenuDto.Menu read(Integer id) {
        Optional<MenuEntity> result = menuRepository.findById(id);

        if (result.isPresent()){
            MenuEntity entity = result.get();

            return MenuDto.Menu.from(entity);
        }

        return null;
    }

    // 전체 조회
    public List<MenuDto.Menu> list() {
        List<MenuEntity> result = menuRepository.findAll();
        return result.stream().map(MenuDto.Menu::from).toList();
    }
}
