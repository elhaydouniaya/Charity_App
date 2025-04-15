package org.example.charity_app.repositories;

import org.example.charity_app.entities.Campaign;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface CampaignRepository extends JpaRepository<Campaign, Long> {
    Page<Campaign> findAll(Pageable pageable);
}
