package fr.polytech.Utilisateur.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.polytech.Utilisateur.repositories.AbonnementRepository;



@Service
public class AbonnementService {
    @Autowired
    private AbonnementRepository abonnementRepository;
    
}
