package org.example.charity_app.services;

import org.example.charity_app.dtos.CampaignDTO;
import org.example.charity_app.repositories.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
public class CampaignServiceImpl implements CampaignService {

    @Autowired
    private CampaignRepository campaignRepo;

    @Override
    public Page<CampaignDTO> getAllCampaigns(int page, int size) {
        Pageable pageable = (Pageable) PageRequest.of(page, size);
        return campaignRepo.findAll(pageable)
                .map(c -> new CampaignDTO(c.getTitle(), c.getDescription(), c.getGoalAmount()));
    }
}
