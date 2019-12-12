package main;

import gui.NoteGui;

public class Main {

  /**
   * Main method.
   */
  public static void main(String[] args) {
    NoteGui app = new NoteGui("Note app!");
    app.setVisible(true);
    app.pack();
  }
}
