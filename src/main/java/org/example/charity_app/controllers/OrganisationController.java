package org.example.charity_app.controllers;

import org.example.charity_app.entities.Organisation;
import org.example.charity_app.services.OrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/organisations")
public class OrganisationController {
    @Autowired
    private OrganisationService organisationService;

    @PostMapping
    public ResponseEntity<Organisation> create(@RequestBody Organisation organisation) {
        return ResponseEntity.ok(organisationService.create(organisation));
    }

    @PatchMapping("/{id}/validate")
    public ResponseEntity<Organisation> validate(@PathVariable Long id) {
        return ResponseEntity.ok(organisationService.validate(id));
    }

    @GetMapping("/organisations")
    public String showOrganisations(Model model) {
        List<Organisation> organisations = organisationService.getAll();
        model.addAttribute("organisations", organisations);
        return "organisations"; // va afficher organisations.html dans templates
    }
}