package com.socialserviceinfo.infoforsocialservice.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Data
public class Badlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String badplace;
    public String badcontent;
    public String badaddress;
    public String badphone;

    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    public Date badpostdate;



}
