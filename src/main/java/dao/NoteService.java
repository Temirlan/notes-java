package dao;

import model.Note;

import java.util.ArrayList;

public class NoteService {
    private static ArrayList<Note> notes = new ArrayList<Note>();

    public static void insert(Note note) {
        notes.add(note);
    }

    public static void update(Note note) {
        for (int n = 0; n < notes.size(); n++) {
            if (notes.get(n).getId() == note.getId()) {
                notes.get(n).setText(note.getText());
                notes.get(n).setTitle(note.getTitle());
            }
        }
    }

    public static void delete(Note note) {
        notes.remove(note);
    }

    public static ArrayList<Note> getNotes() {
        return notes;
    }
}
