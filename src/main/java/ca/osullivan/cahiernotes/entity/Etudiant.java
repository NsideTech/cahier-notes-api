package ca.osullivan.cahiernotes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String cour;
    private float note;

    public Etudiant(){}

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getCour() {
        return cour;
    }

    public float getNote() {
        return note;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCours(String cour) {
        this.cour = cour;
    }

    public void setNote(float note) {
        this.note = note;
    }
}
