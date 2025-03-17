package org.example.charity_app.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class Users {
    @Id
    private long id;
    private String firstName;
    private String lastName;
}


