package fr.polytech.Utilisateur.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import fr.polytech.Utilisateur.services.TypeJustificatifService;
import fr.polytech.Utilisateur.models.TypeJustificatif;


@RestController
@RequestMapping("/typeJustificatif")
public class TypeJustificatifController {
    @Autowired
    private TypeJustificatifService typeJustificatifService;


    @GetMapping("/")
    private ResponseEntity<List<TypeJustificatif>> getAllTypeJustificatif() {
        List<TypeJustificatif> typeJustificatif = typeJustificatifService.getAllTypeJustificatif();
        HttpStatus status = typeJustificatif.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK;
        return new ResponseEntity<>(typeJustificatif, status);
    }
}
