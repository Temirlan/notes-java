package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateNoteEventListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String message = "";
        message += "Button was pressed\n";
        JOptionPane.showMessageDialog(null,
                message,
                "Output",
                JOptionPane.PLAIN_MESSAGE);
    }
}
