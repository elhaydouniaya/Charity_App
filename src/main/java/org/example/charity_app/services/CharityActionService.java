package org.example.charity_app.services;

import org.example.charity_app.entities.CharityAction;
import org.example.charity_app.repositories.CharityActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharityActionService {

    @Autowired
    private CharityActionRepository charityActionRepository;

    // Créer une nouvelle action de charité
    public CharityAction create(CharityAction action) {
        return charityActionRepository.save(action);
    }

    // Récupérer les actions de charité par catégorie
    public List<CharityAction> getByCategorie(String categorie) {
        return charityActionRepository.findByCategory(categorie); // Assurez-vous que le nom de la méthode correspond à la colonne de la base de données
    }
}
