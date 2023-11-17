package fr.polytech.Utilisateur.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.polytech.Utilisateur.models.TypeJustificatif;
import fr.polytech.Utilisateur.repositories.TypeJustificatifRepository;

@Service
public class TypeJustificatifService {
    @Autowired
    private TypeJustificatifRepository typeJustificatifRepository;

    public List<TypeJustificatif> getAllTypeJustificatif() {
        return typeJustificatifRepository.findAll();
    }
}
