package com.example.Backend_Beginner.Controller.Quiz;

import com.example.Backend_Beginner.domain.quiz.Quiz;
import com.example.Backend_Beginner.dto.quiz.QuizResponse;
import com.example.Backend_Beginner.dto.quiz.QuizSubmission;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/Quiz")
public class QuizController {
    private final Quiz quiz;

    public QuizController(){
        this.quiz= new Quiz("박세찬의 나이는?", Arrays.asList("24살","25살","26살","27살"), "26살");
    }

    @GetMapping
    public Quiz getQuiz() {
        return quiz;
    }
    @PostMapping
    public QuizResponse submitQuiz(@RequestBody QuizSubmission quizSubmission) {
        boolean correct = quiz.getCorrectAnswer().equalsIgnoreCase(quizSubmission.getSelectedAnswer());
        String message = correct ? "정답입니다!" : "틀렸지롱!";

        return new QuizResponse(correct,message);
    }
}
