package gui;

import javax.swing.*;

public class SimpleButtons extends JFrame{
    private JPanel mainPanel;
    private JButton a0Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JPanel DisplayLabel;
    private JTextPane displayValue;

    SimpleButtons()
    {
        super("SimpleButtons");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public static void main(String[] args) {
        SimpleButtons simpleButtons=new SimpleButtons();
        simpleButtons.setVisible(true);
    }
}
