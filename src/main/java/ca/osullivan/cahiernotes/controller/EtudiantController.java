package ca.osullivan.cahiernotes.controller;

import ca.osullivan.cahiernotes.entity.Etudiant;
import ca.osullivan.cahiernotes.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EtudiantController {

    private Long produitId = 1L;

    @Autowired
    private EtudiantService etudiantService;

    @PostMapping(value = "/etudiant")
    public ResponseEntity<Object> creerEtudiant(@RequestBody Etudiant etudiant){

        etudiantService.creerEtudiant(etudiant);
        String message = etudiant.getNom() + " ," +" a été crée";

        return ResponseEntity.ok().body(message);
    }

    @GetMapping(value = "/etudiants")
    public ResponseEntity<List<Etudiant>> listeEtudiants(){

        List<Etudiant> etudiants = etudiantService.listeEtudiants();
        return ResponseEntity.ok().body(etudiants);
    }
}
