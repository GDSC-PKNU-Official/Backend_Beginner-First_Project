package com.example.Backend_Beginner.Controller.Quiz;

import com.example.Backend_Beginner.domain.quiz.Quiz;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/Quiz")
public class QuizController {
    private final Quiz quiz;

    public QuizController(){
        this.quiz= new Quiz("박세찬의 나이는?", Arrays.asList("24살","25살","26살","27살"), "26살");
    }

    @GetMapping
    public Quiz getQuiz(){
        return quiz;
    }
}
