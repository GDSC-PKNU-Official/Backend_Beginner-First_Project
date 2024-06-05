package PKNU.first_spring;

import PKNU.first_spring.repository.MemberRepository;
import PKNU.first_spring.repository.MemoryMemberRepository;
import PKNU.first_spring.service.MemberService;
import PKNU.first_spring.service.QuizService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository(); //이후 DbMemberRepository로 바뀔 예정
    }

    @Bean
    public QuizService quizService() {
        return new QuizService();
    }
}
