package fr.polytech.Utilisateur.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import fr.polytech.Utilisateur.services.JustificatifService;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/justificatif")
public class JustificatifController {
    @Autowired
    private JustificatifService justificatifService;



    @PostMapping("/")
    public ResponseEntity<String> addJustificatif(@RequestParam("file") MultipartFile file) {
        return null;
    }
}
