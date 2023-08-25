package com.socialserviceinfo.infoforsocialservice.service;

import com.socialserviceinfo.infoforsocialservice.entity.Socialservice;
import com.socialserviceinfo.infoforsocialservice.repository.SocialServiceRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialServiceService {

    @Autowired
    public SocialServiceRepository socialServiceRepository;

    public List<Socialservice> socialServiceListView() {
        return socialServiceRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }



}
