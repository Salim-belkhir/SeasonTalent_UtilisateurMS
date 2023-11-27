package fr.polytech.Utilisateur.services;

import fr.polytech.Utilisateur.models.TypeAbonnement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.polytech.Utilisateur.repositories.TypeAbonnementRepository;

import java.util.List;

@Service
public class TypeAbonnementService {
    @Autowired
    private TypeAbonnementRepository typeAbonnementRepository;

    public List<TypeAbonnement> getAllTypeAbonnement() {
        return typeAbonnementRepository.findAll();
    }
}
