package com.socialserviceinfo.infoforsocialservice.service;

import com.socialserviceinfo.infoforsocialservice.entity.Badlist;
import com.socialserviceinfo.infoforsocialservice.entity.Blacklist;
import com.socialserviceinfo.infoforsocialservice.repository.BadlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BadlistService {

    @Autowired
    private BadlistRepository badlistRepository;


    public List<Badlist> badListView() {
        return badlistRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    public void badListWrite(Badlist badlist) {
        badlistRepository.save(badlist);
    }

    public List<Badlist> search(String keyword) {
        return badlistRepository.findByBadplaceContaining(keyword);
    }

    public Badlist badView(Long id) {
        return badlistRepository.findById(id).get();
    }

    public void delete(Long id) {
        badlistRepository.deleteById(id);
    }


}
