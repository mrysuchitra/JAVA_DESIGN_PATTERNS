package sample2;

import java.util.ArrayList;
import java.util.List;

public class Song implements MusicalItem{

    private final List<Note> notes = new ArrayList<>();

    public void addNote(Note note) {
        notes.add(note);
    }

    public List<Note> getNotes() {
           return notes;
    }


    @Override
    public void play() {
        notes.forEach(Note :: play);
    }
}
