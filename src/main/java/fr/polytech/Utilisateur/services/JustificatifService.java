package fr.polytech.Utilisateur.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.polytech.Utilisateur.repositories.JustificatifRepository;

@Service
public class JustificatifService {
    @Autowired
    private JustificatifRepository justificatifRepository;
}
