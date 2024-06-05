package PKNU.first_spring.controller;

import PKNU.first_spring.domain.Member;
import PKNU.first_spring.repository.MemberRepository;
import PKNU.first_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MemberController {
    private final MemberService memberService;
    private final MemberRepository memberRepository;

    @Autowired
    public MemberController(MemberService memberService, MemberRepository memberRepository) {
        this.memberService = memberService;
        this.memberRepository = memberRepository;
    }

    @GetMapping("/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public String createMember(MemberForm form) {
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);
        return "redirect:/";
    }

    @GetMapping("/members")
    public String List(Model model){
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "/members/memberList";
    }


    @GetMapping("/members/json")
    @ResponseBody
    public List<Member> listMembersJson() {
        return memberService.findMembers();
    }

    @GetMapping("/members/delete")
    public String delete(){
        return "/members/deleteMemberForm";
    }

    @PostMapping("/members/delete")
    public String delete(MemberForm form){
        memberService.delete(form.getName());
        return "redirect:/";
    }
}
