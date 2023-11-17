package fr.polytech.Utilisateur.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "utilisateur")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Utilisateur {

    @Id
    private Long idUtilisateur;
    private String siret;
    private String nom;
    private String prenom;
    private String mail;
    private String photoProfil;    
    private String telephone;
    private boolean isBanned;
    private boolean isDeleted;

    @OneToOne
    @JoinColumn(name = "idAbonnement")
    private Abonnement abonnement;
}
