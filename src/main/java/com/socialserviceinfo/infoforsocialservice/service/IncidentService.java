package com.socialserviceinfo.infoforsocialservice.service;

import com.socialserviceinfo.infoforsocialservice.entity.Incident;
import com.socialserviceinfo.infoforsocialservice.repository.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncidentService {

    @Autowired
    private IncidentRepository incidentRepository;

    public List<Incident> incidentListView() {
        return incidentRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    public void incidentWrite(Incident incident) {
        incidentRepository.save(incident);
    }

    public List<Incident> search(String keyword) {
        return incidentRepository.findByIncidentplaceContaining(keyword);
    }

    public Incident incidentView(Long id) {
        return incidentRepository.findById(id).get();
    }

    public void delete(Long id) {
        incidentRepository.deleteById(id);
    }


}
