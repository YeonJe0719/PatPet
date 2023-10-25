package com.yj.patpet.member.mapper;

import com.yj.patpet.common.mapper.GenericMapper;
import com.yj.patpet.member.domain.dto.request.MemberRequest;
import com.yj.patpet.member.domain.entity.Member;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MemberRequestMapper extends GenericMapper<MemberRequest, Member> {
}
