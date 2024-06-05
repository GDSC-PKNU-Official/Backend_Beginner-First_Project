package com.example.Backend_Beginner.dto.quiz;

public class QuizResponse {
    private boolean correct;
    private String message;

    public QuizResponse(boolean correct, String message) {
        this.correct = correct;
        this.message = message;
    }

    public boolean isCorrect() {
        return correct;
    }

    public String getMessage() {
        return message;
    }
}
