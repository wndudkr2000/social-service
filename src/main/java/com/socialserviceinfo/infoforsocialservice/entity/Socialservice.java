package com.socialserviceinfo.infoforsocialservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Socialservice {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public Long id;
    private String placename;
    private String placecontent;
    private String postdate;
}
