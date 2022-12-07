package ca.osullivan.cahiernotes.service;

import ca.osullivan.cahiernotes.entity.Etudiant;
import ca.osullivan.cahiernotes.repository.EtudiantRepositoryInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService implements EtudiantServiceInt{

    @Autowired
    private EtudiantRepositoryInt etudiantRepository;

    @Override
    public void creerEtudiant(Etudiant etudiant) {
        etudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> listeEtudiants() {
        return (List<Etudiant>) etudiantRepository.findAll();
    }
}
