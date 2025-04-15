package org.example.charity_app.services;

import org.example.charity_app.dtos.CampaignDTO;
import org.springframework.data.domain.Page;

public interface CampaignService {
    Page<CampaignDTO> getAllCampaigns(int page, int size);
}
