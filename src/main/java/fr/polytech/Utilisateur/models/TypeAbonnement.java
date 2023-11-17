package fr.polytech.Utilisateur.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "typeAbonnement")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TypeAbonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "typeAbonnement_id_seq")
    @SequenceGenerator(name = "typeAbonnement_id_seq", sequenceName = "typeAbonnement_id_seq", allocationSize = 1)
    private Long idTypeAbonnement;

    private String nomAbonnement;

    private String descr;
}
