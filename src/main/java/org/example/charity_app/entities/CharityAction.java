package org.example.charity_app.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CharityAction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String description;

    private String category;

    private Double goalAmount;

    private String location;

    private Double collectedAmount = 0.0;

    private LocalDate actionDate;

    private LocalDate startDate;

    @ElementCollection
    private List<String> media;

    @ManyToOne
    @JoinColumn(name = "organisation_id")
    private Organisation organisation;
}
