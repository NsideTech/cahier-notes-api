package ca.osullivan.cahiernotes.repository;

import ca.osullivan.cahiernotes.entity.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRespository extends CrudRepository<Note,Long> {
}
