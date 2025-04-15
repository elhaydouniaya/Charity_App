package org.example.charity_app.repositories;

import org.example.charity_app.entities.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrganisationRepository extends JpaRepository<Organisation, Long> {
    // Modification de 'findByNom' en 'findByName' car la propriété correcte est 'name' dans l'entité
    Optional<Organisation> findByName(String name);
}
