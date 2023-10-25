package com.yj.patpet.member.service;

import com.yj.patpet.member.domain.dto.request.MemberRequest;
import com.yj.patpet.member.domain.dto.response.MemberResponse;
import com.yj.patpet.member.domain.entity.Member;
import com.yj.patpet.member.mapper.MemberRequestMapper;
import com.yj.patpet.member.mapper.MemberResponseMapper;
import com.yj.patpet.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    private final MemberResponseMapper memberResponseMapper;
    private final MemberRequestMapper memberRequestMapper;

    public MemberResponse loadMember(Member member){
        return memberResponseMapper.toDto(member);
    }

    public void addMember(MemberRequest memberRequest){
        Member member = memberRequestMapper.toEntity(memberRequest);
        memberRepository.save(member);
    }
}
