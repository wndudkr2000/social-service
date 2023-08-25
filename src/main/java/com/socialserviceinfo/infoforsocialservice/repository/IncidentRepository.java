package com.socialserviceinfo.infoforsocialservice.repository;

import com.socialserviceinfo.infoforsocialservice.entity.Incident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IncidentRepository extends JpaRepository<Incident, Long> {
    public List<Incident> findByIncidentplaceContaining(String keyword);
}
