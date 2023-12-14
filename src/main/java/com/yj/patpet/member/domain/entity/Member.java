package com.yj.patpet.member.domain.entity;

import com.yj.patpet.common.domain.entity.BaseEntity;
import com.yj.patpet.member.domain.dto.request.MemberRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
@EntityListeners(AuditingEntityListener.class)
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    //위의 noargscontructor 어노테이션을 사용하고 있고 setter가 없으니까 name을 가진 생성자가 없어서 builder로 안만들어주면 null값이 들어간 객체만 만들어짐
    @Builder
    public Member(String name){
        this.name = name;
    }
}

