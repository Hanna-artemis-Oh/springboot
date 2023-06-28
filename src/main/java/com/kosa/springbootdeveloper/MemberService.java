package com.kosa.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}
