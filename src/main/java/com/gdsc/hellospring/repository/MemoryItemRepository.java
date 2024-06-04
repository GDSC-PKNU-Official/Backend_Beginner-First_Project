package com.gdsc.hellospring.repository;

import com.gdsc.hellospring.domain.Item;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MemoryItemRepository implements ItemRepository {

    private static Map<Long, Item> store = new HashMap<>(); //저장공간
    private static Long sequence = 0L; //id를 생성하기 위한 sequence

    @Override
    public void save(Item item) {
        item.initId(++sequence); //id를 생성하고 item 저장
        store.put(item.getId(), item); //store에 저장
    }

    @Override
    public Item findById(Long id) { //id에 해당하는 item을 찾아서 반환
        return store.get(id);
    }

    @Override
    public List<Item> findAll() { //store에 있는 모든 value를 ArrayList에 담아서 반환
        return store.values().stream().toList();
    }

    @Override
    public void updateById(Long id, Item item) { //store에 저장, hasp map은 key가 같으면 덮어씌워지기 때문에 id는 그대로 사용하고 내용만 수정
        store.put(id, item);
    }

    @Override
    public void deleteById(Long id) { // id에 해당하는 item을 찾아서 삭제
        store.remove(id);
    }

    // 애플리케이션 시작 시 테스트 데이터를 추가합니다.
    static {
        store.put(1L, Item.builder().name("Item1").count(10L).build());
        store.put(2L, Item.builder().name("Item2").count(20L).build());
    }
}
