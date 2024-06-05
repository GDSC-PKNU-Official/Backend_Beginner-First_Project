package PKNU.first_spring.repository;

import PKNU.first_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    void deleteMember(Member member);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
