package com.socialserviceinfo.infoforsocialservice.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Data
public class Goodlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String goodplace;
    public String goodcontent;
    public String goodaddress;
    public String goodphone;

    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    public String goodpostdate;
}
