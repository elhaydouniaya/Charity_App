package org.example.charity_app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "app_user")  // Nom de la table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")  // Nom de la colonne dans la base de données
    private String firstName;  // Correspond au prénom de l'utilisateur

    private String lastName;  // Nom de famille de l'utilisateur

    private String email;  // Email de l'utilisateur

    private String password;  // Mot de passe de l'utilisateur

    private LocalDateTime createdAt = LocalDateTime.now();  // Date de création

    @OneToMany(mappedBy = "user")
    private List<Donation> donations;

    @OneToMany(mappedBy = "admin")
    private List<Organisation> organisations;

    @Enumerated(EnumType.STRING)
    private Role role;
}
