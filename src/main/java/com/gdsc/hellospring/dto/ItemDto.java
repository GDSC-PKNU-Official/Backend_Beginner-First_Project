package com.gdsc.hellospring.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ItemDto { //데이터(정보)를 주고 받을 때 사용

    private Long id;
    private String name;
    private Long count;

    @Builder
    public ItemDto(Long id, String name, Long count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }
}
