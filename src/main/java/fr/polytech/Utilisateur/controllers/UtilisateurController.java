package fr.polytech.Utilisateur.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.polytech.Utilisateur.services.AbonnementService;

@RestController
@RequestMapping("/user")
public class UtilisateurController {
    @Autowired
    private AbonnementService abonnementService;
}
