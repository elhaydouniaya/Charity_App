package org.example.charity_app.dtos;

import java.math.BigDecimal;

public class CampaignDTO {
    private String title;
    private String description;
    private BigDecimal goalAmount;

    public CampaignDTO(String title, String description, BigDecimal goalAmount) {
        this.title = title;
        this.description = description;
        this.goalAmount = goalAmount;
    }
}
