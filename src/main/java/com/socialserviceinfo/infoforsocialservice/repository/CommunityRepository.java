package com.socialserviceinfo.infoforsocialservice.repository;

import com.socialserviceinfo.infoforsocialservice.entity.Community;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommunityRepository extends JpaRepository<Community, Long> {
    public List<Community> findBySubjectContaining(String keyword);
}
