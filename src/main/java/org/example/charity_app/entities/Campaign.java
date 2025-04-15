package org.example.charity_app.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private BigDecimal goalAmount;
    private BigDecimal currentAmount;

    @ManyToOne
    @JoinColumn(name = "organisation_id")
    private Organisation organisation;

    // ✅ Constructeurs
    public Campaign() {}

    public Campaign(String title, String description, BigDecimal goalAmount) {
        this.title = title;
        this.description = description;
        this.goalAmount = goalAmount;
    }

    // ✅ GETTERS
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getGoalAmount() {
        return goalAmount;
    }

    public BigDecimal getCurrentAmount() {
        return currentAmount;
    }

    public Organisation getOrganisation() {
        return organisation;
    }

    public Long getId() {
        return id;
    }

    // ✅ SETTERS (facultatif mais recommandé)
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGoalAmount(BigDecimal goalAmount) {
        this.goalAmount = goalAmount;
    }

    public void setCurrentAmount(BigDecimal currentAmount) {
        this.currentAmount = currentAmount;
    }

    public void setOrganisation(Organisation organisation) {
        this.organisation = organisation;
    }
}
