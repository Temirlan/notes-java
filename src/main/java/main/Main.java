package main;

import gui.NoteGUI;

public class Main {
    public static void main(String[] args) {
        NoteGUI app = new NoteGUI("Note app!");
        app.setVisible(true);
        app.pack();
    }
}
