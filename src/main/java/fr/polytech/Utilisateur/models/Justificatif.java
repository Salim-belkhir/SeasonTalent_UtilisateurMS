package fr.polytech.Utilisateur.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "justificatif")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Justificatif {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "justificatif_seq")
    @SequenceGenerator(name = "justificatif_seq", sequenceName = "justificatif_seq", allocationSize = 1)
    private Long idJustificatif;

    private String lien;

    private boolean estValide;

    @ManyToOne
    @JoinColumn(name = "idTypeJustificatif")
    private TypeJustificatif typeJustificatif;

    @ManyToOne
    @JoinColumn(name = "idUtilisateur")
    private Utilisateur utilisateur;

}
