package com.socialserviceinfo.infoforsocialservice.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;


@Entity
@Data
public class Community {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String subject;
    public String content;

    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    public String communitypostdate;
}
