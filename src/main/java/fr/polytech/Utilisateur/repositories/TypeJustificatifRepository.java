package fr.polytech.Utilisateur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.polytech.Utilisateur.models.TypeJustificatif;


public interface TypeJustificatifRepository extends JpaRepository<TypeJustificatif, Long> {
    
}
