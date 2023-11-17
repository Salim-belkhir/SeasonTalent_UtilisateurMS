package fr.polytech.Utilisateur.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.polytech.Utilisateur.services.TypeAbonnementService;


@RestController
@RequestMapping("/typeAbonnement")
public class TypeAbonnementController {
    @Autowired
    private TypeAbonnementService typeAbonnementService;
}
