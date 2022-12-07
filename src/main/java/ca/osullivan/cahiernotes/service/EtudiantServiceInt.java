package ca.osullivan.cahiernotes.service;

import ca.osullivan.cahiernotes.entity.Etudiant;

import java.util.List;

public interface EtudiantServiceInt {

    public void creerEtudiant(Etudiant etudiant);

    public List<Etudiant> listeEtudiants();
}


