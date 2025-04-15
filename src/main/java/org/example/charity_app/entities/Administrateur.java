package org.example.charity_app.entities;

import jakarta.persistence.*;
@Entity
public class Administrateur {





        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @Column(name = "Nom famille")
        private String firstName;
        private String lastName;
        private String email;
        private String password;
}
