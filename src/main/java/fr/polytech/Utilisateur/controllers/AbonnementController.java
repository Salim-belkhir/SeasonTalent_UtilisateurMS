package fr.polytech.Utilisateur.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.polytech.Utilisateur.services.AbonnementService;

@RestController
@RequestMapping("/abonnement")
public class AbonnementController {
    @Autowired
    private AbonnementService abonnementService;
}