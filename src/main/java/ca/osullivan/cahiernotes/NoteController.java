package ca.osullivan.cahiernotes;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/notes")
public class NoteController {
    public ResponseEntity<Object> saveNote() {
        //TODO
        return ResponseEntity.ok().build();
    }
}
