package com.socialserviceinfo.infoforsocialservice.repository;

import com.socialserviceinfo.infoforsocialservice.entity.Badlist;
import com.socialserviceinfo.infoforsocialservice.entity.Blacklist;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BadlistRepository extends JpaRepository<Badlist, Long> {

    public List<Badlist> findByBadplaceContaining(String keyword);

}
