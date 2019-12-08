package gui;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class NoteGui extends JFrame {
  private JButton button;
  private JTextField input;
  private JLabel label;

  /**
   * String name.
   */
  public NoteGui(String name) {
    super(name);
    this.setBounds(100, 100, 500, 500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.button = new JButton("Create note");
    this.input = new JTextField("", 15);
    this.label = new JLabel("Input:");

    initContainer();
  }

  private void initContainer() {
    Container container = this.getContentPane();

    container.setLayout(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();

    constraints.fill = GridBagConstraints.BOTH;
    constraints.gridy = 0;

    constraints.gridx = 0;
    constraints.insets = new Insets(20, 50, 50, 0);
    container.add(label, constraints);

    constraints.gridx = 1;
    constraints.insets = new Insets(20, 0, 50, 0);
    container.add(input, constraints);

    constraints.gridx = 2;
    constraints.insets = new Insets(20, 10, 50, 50);

    button.addActionListener(new CreateNoteEventListener(this.input));
    container.add(button, constraints);
  }
}
