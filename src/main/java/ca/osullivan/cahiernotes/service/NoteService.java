package ca.osullivan.cahiernotes.service;


import ca.osullivan.cahiernotes.entity.Note;
import ca.osullivan.cahiernotes.repository.NoteRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    @Autowired
    private NoteRespository noteRespository;

    public void saveNote(Note note){noteRespository.save(note);}
    public List<Note> getNote(){return (List<Note>) noteRespository.findAll();}
}
