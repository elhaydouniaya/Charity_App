package org.example.charity_app.repositories;

import org.example.charity_app.entities.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdministrateurRepository  extends JpaRepository<Administrateur, Long> {
    Optional<Administrateur> findByEmail(String email);
}
