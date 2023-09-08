package com.yj.patpet.member.controller;

import com.yj.patpet.member.domain.dto.response.MemberResponse;
import com.yj.patpet.member.domain.entity.Member;
import com.yj.patpet.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping
    public MemberResponse loadMember(Member member){
        return memberService.loadMember(member);
    }

}
