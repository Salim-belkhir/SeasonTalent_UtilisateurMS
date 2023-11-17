package fr.polytech.Utilisateur.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.polytech.Utilisateur.services.AbonnementService;
import fr.polytech.Utilisateur.models.Abonnement;

@RestController
@RequestMapping("/abonnements")
public class AbonnementController {
    @Autowired
    private AbonnementService abonnementService;

    @GetMapping("/")
    public ResponseEntity<List<Abonnement>> getAllAbonnements() {
        List<Abonnement> abonnements = abonnementService.getAllAbonnements();
        HttpStatus status = abonnements.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK;
        return new ResponseEntity<>(abonnements, status);
    }

    @GetMapping("{id}")
    public ResponseEntity<Abonnement> getAbonnementById(@PathVariable Long id) {
        Abonnement abonnement = abonnementService.getAbonnementById(id);
        HttpStatus status = abonnement == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return new ResponseEntity<>(abonnement, status);
    }

    @PostMapping("/")
    public ResponseEntity<Abonnement> createAbonnement(@RequestBody Abonnement abonnement) {
        Abonnement newAbonnement = abonnementService.createAbonnement(abonnement);
        HttpStatus status = newAbonnement == null ? HttpStatus.BAD_REQUEST : HttpStatus.CREATED;
        return new ResponseEntity<>(newAbonnement, status);
    }

    @PutMapping("{id}")
    public ResponseEntity<Abonnement> updateAbonnement(@PathVariable Long id, @RequestBody Abonnement abonnement) {
        Abonnement updatedAbonnement = abonnementService.updateAbonnement(id, abonnement);
        HttpStatus status = updatedAbonnement == null ? HttpStatus.BAD_REQUEST : HttpStatus.OK;
        return new ResponseEntity<>(updatedAbonnement, status);
    }

    @PatchMapping("{id}")
    public ResponseEntity<Abonnement> updateAbonnement(@PathVariable Long id, @RequestBody Map<String, Object> fields) {
        Abonnement updatedAbonnement = abonnementService.updateAbonnement(id, fields);
        HttpStatus status = updatedAbonnement == null ? HttpStatus.BAD_REQUEST : HttpStatus.OK;
        return new ResponseEntity<>(updatedAbonnement, status);
    }


    //TODO : Verifier si l'utilisateur a le droit ou pas
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteAbonnementById(@PathVariable Long id) {
        boolean isDeleted = abonnementService.deleteAbonnementById(id);
        HttpStatus status = isDeleted ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        String message = isDeleted ? "Abonnement supprimé" : "Abonnement non trouvé";
        return new ResponseEntity<>(message, status);
    }

    
}
