package com.socialserviceinfo.infoforsocialservice.service;

import com.socialserviceinfo.infoforsocialservice.entity.Blacklist;
import com.socialserviceinfo.infoforsocialservice.repository.BlacklistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlacklistService {
    @Autowired
    private BlacklistRepository blacklistRepository;

    public List<Blacklist> blacklistView() {
        return blacklistRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    public void blackListWrite(Blacklist blacklist) {
        blacklistRepository.save(blacklist);
    }

    public List<Blacklist> search(String keyword) {
        return blacklistRepository.findByBlacklistplaceContaining(keyword);
    }

    public Blacklist blackView(Long id) {
        return blacklistRepository.findById(id).get();
    }

    public void delete(Long id) {
        blacklistRepository.deleteById(id);
    }
}
