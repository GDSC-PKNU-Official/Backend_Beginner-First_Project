package com.example.todolist.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId; // 추가된 필드
    private String title;
    private String description;
    private boolean completed;

    // 기본 생성자
    public Task() {}

    // 모든 필드를 포함하는 생성자
    public Task(Long id, Long userId, String title, String description, LocalDateTime dueDate, boolean completed) {
        this.id = id;
        this.userId = userId; // 추가된 필드
        this.title = title;
        this.description = description;
        this.completed = completed;
    }

    // ID에 대한 게터와 세터
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // UserId에 대한 게터와 세터 (추가된 부분)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    // 제목에 대한 게터와 세터
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // 설명에 대한 게터와 세터
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // 완료 여부에 대한 게터와 세터
    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
