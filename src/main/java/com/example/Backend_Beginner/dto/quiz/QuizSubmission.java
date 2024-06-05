package com.example.Backend_Beginner.dto.quiz;

public class QuizSubmission {
    private String selectedAnswer;

    public QuizSubmission(String selectedAnswer) {
        this.selectedAnswer = selectedAnswer;
    }

    public String getSelectedAnswer() {
        return selectedAnswer;
    }
}
