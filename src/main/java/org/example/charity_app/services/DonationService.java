package org.example.charity_app.services;

import org.example.charity_app.entities.Donation;
import org.example.charity_app.repositories.DonationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DonationService {
    @Autowired
    private DonationRepository donationRepository;

    public Donation donate(Donation donation) {
        donation.setDate(LocalDateTime.now());
        donation.setPaiementEffectue(true);
        return donationRepository.save(donation);
    }

    public List<Donation> getByUser(Long userId) {
        return donationRepository.findByUserId(userId);
    }
}
