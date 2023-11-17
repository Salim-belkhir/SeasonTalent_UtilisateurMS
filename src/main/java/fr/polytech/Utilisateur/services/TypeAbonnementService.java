package fr.polytech.Utilisateur.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.polytech.Utilisateur.repositories.TypeAbonnementRepository;

@Service
public class TypeAbonnementService {
    @Autowired
    private TypeAbonnementRepository typeAbonnementRepository;
}
