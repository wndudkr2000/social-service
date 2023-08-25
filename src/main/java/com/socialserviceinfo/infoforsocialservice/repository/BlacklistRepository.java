package com.socialserviceinfo.infoforsocialservice.repository;

import com.socialserviceinfo.infoforsocialservice.entity.Blacklist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlacklistRepository extends JpaRepository<Blacklist, Long> {
    public List<Blacklist> findByBlacklistplaceContaining(String keyword);

}
