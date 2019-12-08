package dao;

import java.util.ArrayList;

import model.Note;


public class NoteService {
  private static ArrayList<Note> notes = new ArrayList<Note>();

  /**
   * Note note.
   */
  public static void insert(Note note) {
    notes.add(note);
  }

  /**
   * Note note.
   */
  public static void update(Note note) {
    for (Note note1 : notes) {
      if (note1.getId() == note.getId()) {
        note1.setText(note.getText());
        note1.setTitle(note.getTitle());
      }
    }
  }

  /**
   * Note note.
   */
  public static void delete(Note note) {
    notes.remove(note);
  }

  public static ArrayList<Note> getNotes() {
    return notes;
  }
}
