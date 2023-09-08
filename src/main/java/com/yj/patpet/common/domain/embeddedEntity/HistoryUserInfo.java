package com.yj.patpet.common.domain.embeddedEntity;

import com.yj.patpet.member.domain.entity.Member;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Getter
@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class HistoryUserInfo {
    private Long userId;
    private String userName;

    public HistoryUserInfo(Member member) {
        this.userId = member.getId();
        this.userName = member.getName();
    }
}
