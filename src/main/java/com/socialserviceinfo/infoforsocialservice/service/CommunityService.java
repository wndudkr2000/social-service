package com.socialserviceinfo.infoforsocialservice.service;

import com.socialserviceinfo.infoforsocialservice.entity.Community;
import com.socialserviceinfo.infoforsocialservice.repository.CommunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunityService {

    @Autowired
    private CommunityRepository communityRepository;

    public List<Community> communityListView() {
        return communityRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    public void communityWrite(Community community) {
        communityRepository.save(community);
    }

    public List<Community> search(String keyword) {
        return communityRepository.findBySubjectContaining(keyword);
    }

    public Community communityView(Long id) {
        return communityRepository.findById(id).get();
    }

    public void delete(Long id) {
        communityRepository.deleteById(id);
    }

}
