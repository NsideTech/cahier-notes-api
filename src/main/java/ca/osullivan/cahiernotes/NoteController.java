package ca.osullivan.cahiernotes;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class NoteController {
    @PostMapping("/notes")
    public ResponseEntity<Object> saveNote() {
        //TODO
        return ResponseEntity.ok().build();
    }
}
