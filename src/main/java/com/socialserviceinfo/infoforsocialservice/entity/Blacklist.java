package com.socialserviceinfo.infoforsocialservice.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Data
public class Blacklist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String blacklistplace;
    public String blacklistcontent;
    public String blacklistaddress;
    public String blacklistphone;

    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    public String blacklistpostdate;
}
