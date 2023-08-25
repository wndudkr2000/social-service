package com.socialserviceinfo.infoforsocialservice.service;

import com.socialserviceinfo.infoforsocialservice.entity.Goodlist;
import com.socialserviceinfo.infoforsocialservice.repository.GoodlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodlistService {

    @Autowired
    private GoodlistRepository goodlistRepository;

    public List<Goodlist> goodListView() {
        return goodlistRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    public void goodListWrite(Goodlist goodlist) {
        goodlistRepository.save(goodlist);
    }

    public List<Goodlist> search(String keyword) {
        return goodlistRepository.findByGoodplaceContaining(keyword);
    }

    public Goodlist goodView(Long id) {
        return goodlistRepository.findById(id).get();
    }

    public void delete(Long id) {
        goodlistRepository.deleteById(id);
    }
}
