package com.codebind;

import javax.swing.*;
import java.awt.*;

public class entry extends JFrame{
    private JLabel title1;
    private JLabel numberField;
    private JLabel modelField;
    private JLabel YearField;
    private JLabel conditionField;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton searchButton;
    private JButton saveButton;
    private JPanel mainPanel;

    entry(){
        super("Infromation entry from");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public static void main(String[] args) {
        entry screen =new entry();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        screen.setSize(screenSize.width*1/3, screenSize.height*1/2);
        screen.setVisible(true);
    }
}
