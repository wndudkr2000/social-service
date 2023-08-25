package com.socialserviceinfo.infoforsocialservice.repository;

import com.socialserviceinfo.infoforsocialservice.entity.Socialservice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialServiceRepository extends JpaRepository<Socialservice,Long> {
}
