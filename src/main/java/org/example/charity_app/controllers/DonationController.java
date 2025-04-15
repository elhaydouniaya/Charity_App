package org.example.charity_app.controllers;

import org.example.charity_app.entities.Donation;
import org.example.charity_app.services.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donations")
public class DonationController {
    @Autowired
    private DonationService donationService;

    @PostMapping
    public ResponseEntity<Donation> donate(@RequestBody Donation donation) {
        return ResponseEntity.ok(donationService.donate(donation));
    }

    @GetMapping("/user/{userId}")
    public List<Donation> getUserDonations(@PathVariable Long userId) {
        return donationService.getByUser(userId);
    }
}