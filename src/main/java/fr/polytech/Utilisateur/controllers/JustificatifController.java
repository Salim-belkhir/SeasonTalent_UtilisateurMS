package fr.polytech.Utilisateur.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import fr.polytech.Utilisateur.services.JustificatifService;


@RestController
@RequestMapping("/justificatif")
public class JustificatifController {
    @Autowired
    private JustificatifService justificatifService;
}
