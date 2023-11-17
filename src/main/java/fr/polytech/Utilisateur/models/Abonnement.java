package fr.polytech.Utilisateur.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "abonnement")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "abonnement_id_seq")
    @SequenceGenerator(name = "abonnement_id_seq", sequenceName = "abonnement_id_seq", allocationSize = 1)
    private Long idAbonnement;

    private String nomAbonnement;

    private String duree;
}
