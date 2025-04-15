package org.example.charity_app.controllers;

import org.example.charity_app.dtos.CampaignDTO;
import org.example.charity_app.services.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CampaignController {

    @Autowired
    private CampaignService campaignService;

    @GetMapping("/campaigns")
    public String listCampaigns(@RequestParam(defaultValue = "0") int page, Model model) {
        Page<CampaignDTO> campaignPage = campaignService.getAllCampaigns(page, 5);
        model.addAttribute("campaigns", campaignPage.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", campaignPage.getTotalPages());
        return "campaigns";
    }
}
