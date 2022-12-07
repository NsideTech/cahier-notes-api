package ca.osullivan.cahiernotes.repository;

import ca.osullivan.cahiernotes.entity.Etudiant;
import org.springframework.data.repository.CrudRepository;

public interface EtudiantRepositoryInt extends CrudRepository<Etudiant, Long> {
}
