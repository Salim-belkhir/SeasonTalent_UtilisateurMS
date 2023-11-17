package fr.polytech.Utilisateur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.polytech.Utilisateur.models.Justificatif;


public interface JustificatifRepository extends JpaRepository<Justificatif, Long> {
    
}
