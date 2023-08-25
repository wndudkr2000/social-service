package com.socialserviceinfo.infoforsocialservice.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Data
public class Incident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String incidentplace;
    public String incidentcontent;
    public String incidentaddress;
    public String incidentphone;

    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    public String incidentpostdate;
}
