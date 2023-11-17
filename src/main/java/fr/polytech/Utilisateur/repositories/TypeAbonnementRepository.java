package fr.polytech.Utilisateur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.polytech.Utilisateur.models.TypeAbonnement;


public interface TypeAbonnementRepository extends JpaRepository<TypeAbonnement, Long> {
    
}
