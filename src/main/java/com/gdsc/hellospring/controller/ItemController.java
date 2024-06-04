package com.gdsc.hellospring.controller;

import com.gdsc.hellospring.dto.ItemDto;
import com.gdsc.hellospring.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("items")
    public void save(@RequestBody ItemDto itemDto) { //item의 종류와 개수를 등록
        itemService.saveItem(itemDto);
    }

    @GetMapping("items/{id}")
    public ItemDto findItemById(@PathVariable Long id) { //id를 통해서 item의 종류와 개수 출력
        return itemService.findItemById(id);
    }

    @GetMapping("items")
    public List<ItemDto> findAllItem() { //등록되어 있는 모든 items를 출력
        return itemService.findAllItem();
    }

    @PatchMapping("items/{id}")
    public void updateItemById(@PathVariable Long id, @RequestBody ItemDto itemDto) { //id번호에 해당하는 item의 종류나 개수를 수정
        itemService.updateItemById(id, itemDto);
    }

    @DeleteMapping("items/{id}")
    public void deleteItemById(@PathVariable Long id) { //id를 통해 해당 items을 삭제
        itemService.deleteItemById(id);
    }
}
