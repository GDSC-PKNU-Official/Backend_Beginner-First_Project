package PKNU.first_spring.service;

import PKNU.first_spring.domain.Member;
import PKNU.first_spring.repository.MemberRepository;
import PKNU.first_spring.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Long join(Member member) {
        memberRepository.save(member);
        return member.getId();
    }

    public void delete(String name){
        Member member = memberRepository.findByName(name).get();
        memberRepository.deleteMember(member);
    }

    public List<Member> findMembers() {
        return memberRepository.findAll();
    }
}
