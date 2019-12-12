package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CreateNoteEventListener implements ActionListener {
  private JTextField textField;

  /**
   * JTextField textField.
   */
  public CreateNoteEventListener(JTextField textField) {
    this.textField = textField;
  }

  /**
   * ActionEvent e.
   */
  public void actionPerformed(ActionEvent e) {
    String message = textField.getText();

    JOptionPane.showMessageDialog(null,
            message,
            "Output",
            JOptionPane.PLAIN_MESSAGE);
  }
}
