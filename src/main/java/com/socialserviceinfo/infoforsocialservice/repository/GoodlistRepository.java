package com.socialserviceinfo.infoforsocialservice.repository;

import com.socialserviceinfo.infoforsocialservice.entity.Goodlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodlistRepository extends JpaRepository<Goodlist, Long> {
    public List<Goodlist> findByGoodplaceContaining(String keyword);
}
