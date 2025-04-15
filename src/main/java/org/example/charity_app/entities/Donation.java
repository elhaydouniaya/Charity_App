package org.example.charity_app.entities;
import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Donation {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private Double amount;
        private LocalDateTime donatedAt = LocalDateTime.now();

        @ManyToOne
        @JoinColumn(name = "user_id")
        private User user;

    @ManyToOne
    @JoinColumn(name = "charity_action_id")
    private CharityAction charityAction;


    private LocalDateTime date = LocalDateTime.now();

    public void setPaiementEffectue(boolean b) {
    }
}
