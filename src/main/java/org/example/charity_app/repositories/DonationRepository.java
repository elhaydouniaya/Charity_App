package org.example.charity_app.repositories;

import org.example.charity_app.entities.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DonationRepository extends JpaRepository<Donation, Long> {
    List<Donation> findByUserId(Long userId);
    List<Donation> findByCharityActionId(Long actionId);
}
