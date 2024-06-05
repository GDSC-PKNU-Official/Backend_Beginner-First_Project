package PKNU.first_spring.service;

import java.util.Objects;

public class QuizService {
    public boolean isCorrect(String answer) {
        return answer == "한화 이글스" || answer == "Hanwha Eagles";
    }
}
