package org.example.charity_app.services;

import org.example.charity_app.entities.Organisation;
import org.example.charity_app.repositories.OrganisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganisationService {

        @Autowired
        private OrganisationRepository organisationRepository;

        public Organisation create(Organisation org) {
            org.setValidee(false);
            return organisationRepository.save(org);
        }

        public Organisation validate(Long id) {
            Organisation org = organisationRepository.findById(id).orElseThrow();
            org.setValidee(true);
            return organisationRepository.save(org);
        }
    public List<Organisation> getAll() {
        return organisationRepository.findAll();
    }

}

