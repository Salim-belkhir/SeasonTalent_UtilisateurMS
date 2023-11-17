package fr.polytech.Utilisateur.models;

import jakarta.persistence.Entity;
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

    private Long idUtilisateur;

    private String siret;

    private String nom;
    private String prenom;
    private String mail;
    private String photoProfil;

    
    private String telephone;
    private boolean isBanned;
    private boolean isDeleted;
    private Abonnement abonnement;
}
