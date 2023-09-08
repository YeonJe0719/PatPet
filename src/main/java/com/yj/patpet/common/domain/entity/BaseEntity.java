package com.yj.patpet.common.domain.entity;

import com.yj.patpet.common.domain.embeddedEntity.HistoryUserInfo;
import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
    @Column(name = "created_at_utc", updatable = false, nullable = false)
    @CreatedDate
    private LocalDateTime createdAtUtc;

    @Embedded
    @CreatedBy
    @AttributeOverrides({
            @AttributeOverride(name = "userId", column = @Column(name = "created_user_id", updatable = false, nullable = false)),
            @AttributeOverride(name = "userName", column = @Column(name = "created_user_name", updatable = false, nullable = false, length = 20))
    })
    private HistoryUserInfo createdBy;

    @Column(name = "updated_at_utc", nullable = false)
    @LastModifiedDate
    private LocalDateTime updatedAtUtc;

    @Embedded
    @LastModifiedBy
    @AttributeOverrides({
            @AttributeOverride(name = "userId", column = @Column(name = "updated_user_id", nullable = false)),
            @AttributeOverride(name = "userName", column = @Column(name = "updated_user_name", nullable = false, length = 20))
    })
    private HistoryUserInfo updatedBy;

}
