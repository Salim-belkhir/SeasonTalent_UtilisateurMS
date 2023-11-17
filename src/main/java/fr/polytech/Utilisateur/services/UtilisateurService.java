package fr.polytech.Utilisateur.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import fr.polytech.Utilisateur.repositories.UtilisateurRepository;


@Service
public class UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;
    
}
