package fr.polytech.Utilisateur.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Try {
    @GetMapping("")
    public String hello(){
        return "Hello from Utilisateur";
    }

    @GetMapping("utilisateur")
    public String utilisateur(){
        return "Hello from Utilisateur2";
    }
}
