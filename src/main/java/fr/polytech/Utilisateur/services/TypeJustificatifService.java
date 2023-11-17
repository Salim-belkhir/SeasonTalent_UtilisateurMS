package fr.polytech.Utilisateur.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.polytech.Utilisateur.repositories.TypeJustificatifRepository;

@Service
public class TypeJustificatifService {
    @Autowired
    private TypeJustificatifRepository typeJustificatifRepository;
}
