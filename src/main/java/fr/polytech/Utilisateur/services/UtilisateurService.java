package fr.polytech.Utilisateur.services;

import fr.polytech.Utilisateur.models.Utilisateur;
import jakarta.ws.rs.NotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import fr.polytech.Utilisateur.repositories.UtilisateurRepository;

import java.util.Optional;


@Service
public class UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public Utilisateur getUtilisateurById(Long id) {
        return utilisateurRepository.findById(id).orElse(null);
    }

    public Utilisateur updateUtilisateur(Long id, Utilisateur utilisateur) throws NotFoundException {
        Optional<Utilisateur> utilisateurExistant = utilisateurRepository.findById(id);
        if(!utilisateurExistant.isPresent()) {
            throw new NotFoundException("Utilisateur not found");
        }
        Utilisateur utilisateurToUpdate = utilisateurExistant.get();

        utilisateurToUpdate.setNom(utilisateur.getNom());
        utilisateurToUpdate.setPrenom(utilisateur.getPrenom());
        utilisateurToUpdate.setMail(utilisateur.getMail());
        utilisateurToUpdate.setPhotoProfil(utilisateur.getPhotoProfil());
        utilisateurToUpdate.setSiret(utilisateur.getSiret());
        utilisateurToUpdate.setTelephone(utilisateur.getTelephone());

        utilisateur = utilisateurRepository.save(utilisateurToUpdate);
        return utilisateur;
    }
}
