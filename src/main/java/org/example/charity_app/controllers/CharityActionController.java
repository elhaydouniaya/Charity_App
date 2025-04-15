package org.example.charity_app.controllers;
import org.example.charity_app.entities.CharityAction;
import org.example.charity_app.services.CharityActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RestController
@RequestMapping("/api/actions")
public class CharityActionController {
    @Autowired
    private CharityActionService actionService;

    @PostMapping
    public ResponseEntity<CharityAction> create(@RequestBody CharityAction action) {
        return ResponseEntity.ok(actionService.create(action));
    }

    @GetMapping("/categorie/{categorie}")
    public List<CharityAction> byCategorie(@PathVariable String categorie) {
        return actionService.getByCategorie(categorie);

    }
}