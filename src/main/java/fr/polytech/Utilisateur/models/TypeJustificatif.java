package fr.polytech.Utilisateur.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "typeJustificatif")
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class TypeJustificatif {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "typeJustificatif_seq")
    @SequenceGenerator(name = "typeJustificatif_seq", sequenceName = "typeJustificatif_seq", allocationSize = 1)
    private Long idTypeJustificatif;


    private String label;

    private String consignes;
}