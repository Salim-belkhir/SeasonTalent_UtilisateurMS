package fr.polytech.Utilisateur.controllers;

import fr.polytech.Utilisateur.models.TypeAbonnement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.polytech.Utilisateur.services.TypeAbonnementService;

import java.util.List;


@RestController
@RequestMapping("/typeAbonnement")
public class TypeAbonnementController {
    @Autowired
    private TypeAbonnementService typeAbonnementService;

    @GetMapping("/")
    public ResponseEntity<List<TypeAbonnement>> getAllTypeAbonnement() {
        List<TypeAbonnement> typesAbonnement = typeAbonnementService.getAllTypeAbonnement();
        return new ResponseEntity(typesAbonnement, HttpStatus.OK);
    }
}
