package com.yj.patpet.member.domain.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class MemberRequest {
    @NotBlank
    private String name;
}
