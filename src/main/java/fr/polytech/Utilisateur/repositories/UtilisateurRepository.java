package fr.polytech.Utilisateur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.polytech.Utilisateur.models.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    
}
