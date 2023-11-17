package fr.polytech.Utilisateur.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import fr.polytech.Utilisateur.services.TypeJustificatifService;


@RestController
@RequestMapping("/typeJustificatif")
public class TypeJustificatifController {
    @Autowired
    private TypeJustificatifService typeJustificatifService;
}
