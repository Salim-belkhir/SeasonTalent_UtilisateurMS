package fr.polytech.Utilisateur.models.kafka;


import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserKafka {
    private Long id;
    private String email;
}
