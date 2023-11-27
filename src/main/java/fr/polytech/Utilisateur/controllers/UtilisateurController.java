package fr.polytech.Utilisateur.controllers;

import fr.polytech.Utilisateur.models.Utilisateur;
import fr.polytech.Utilisateur.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import fr.polytech.Utilisateur.services.AbonnementService;

@RestController
@RequestMapping("/user")
public class UtilisateurController {
    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping("/{id}")
    public ResponseEntity<Utilisateur> getUtilisateurById(@PathVariable Long id) {
        Utilisateur utilisateur = utilisateurService.getUtilisateurById(id);
        HttpStatus status = utilisateur != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(utilisateur, status);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Utilisateur> updateUtilisateur(@PathVariable Long id, @RequestBody Utilisateur utilisateur) {
        try{
            utilisateur = utilisateurService.updateUtilisateur(id, utilisateur);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(utilisateur, HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Utilisateur> patchUtilisateur(@PathVariable Long id, @RequestBody Utilisateur utilisateur) {
        try{
            utilisateur = utilisateurService.updateUtilisateur(id, utilisateur);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(utilisateur, HttpStatus.OK);
    }
}
