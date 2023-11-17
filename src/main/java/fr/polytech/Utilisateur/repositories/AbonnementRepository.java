package fr.polytech.Utilisateur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.polytech.Utilisateur.models.Abonnement;

public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {
    
}
