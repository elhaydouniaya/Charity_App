package org.example.charity_app.repositories;

import org.example.charity_app.entities.CharityAction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CharityActionRepository extends JpaRepository<CharityAction, Long> {
    // Méthode pour trouver les actions par catégorie
    List<CharityAction> findByCategory(String category);  // Assurez-vous que le champ dans la classe est "category", pas "categorie"
}
