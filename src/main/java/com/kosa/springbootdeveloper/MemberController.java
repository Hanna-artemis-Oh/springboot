package com.kosa.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {
    @Autowired
    MemberService memberService;

    @GetMapping("/members")
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }
}
