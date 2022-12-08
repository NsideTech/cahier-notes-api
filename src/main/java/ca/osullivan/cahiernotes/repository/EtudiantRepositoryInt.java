package ca.osullivan.cahiernotes.repository;

import ca.osullivan.cahiernotes.entity.Etudiant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepositoryInt extends CrudRepository<Etudiant, Long> {
}
