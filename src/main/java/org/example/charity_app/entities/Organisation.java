package org.example.charity_app.entities;

import jakarta.persistence.*;

@Entity
public class Organisation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;  // Assurez-vous que cette propriété existe
    private String description;
    public void setValidee(boolean b) {

    }

    // Autres propriétés et méthodes...
}
