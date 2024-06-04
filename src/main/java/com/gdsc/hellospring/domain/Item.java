package com.gdsc.hellospring.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Item {

    private Long id; //물건의 고유 id
    private String name; // 물건의 이름
    private Long count; // 물건의 개수(재고)

    //Item 객체를 생성
    @Builder
    public Item(String name, Long count) {
        this.name = name;
        this.count = count;
    }
    //id 초기화 메서드
    public void initId(Long id) {
        this.id = id;
    }
    //item 정보 업데이트 메소드
    public void updateItem(String name, Long count) {
        this.name = name;
        this.count = count;
    }

}