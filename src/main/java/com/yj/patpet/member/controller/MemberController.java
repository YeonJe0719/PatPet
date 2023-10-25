package com.yj.patpet.member.controller;

import com.yj.patpet.member.domain.dto.request.MemberRequest;
import com.yj.patpet.member.domain.dto.response.MemberResponse;
import com.yj.patpet.member.domain.entity.Member;
import com.yj.patpet.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping
    public MemberResponse loadMember(Member member){
        return memberService.loadMember(member);
    }

    @PostMapping("/join")
    public void addMember(@Valid @RequestBody MemberRequest memberRequest){
        //클라이언트에서 form-data로 보낼거면 @modelattribute 어노테이션 사용 (포스트맨의 경우 body > form-data)
        //그러나 클라이언트에서 json형식으로 보낸다면 @requestbody 어노테이션 사용 (포스트맨의 경우 raw -> json 형식)
        memberService.addMember(memberRequest);
    }

}
