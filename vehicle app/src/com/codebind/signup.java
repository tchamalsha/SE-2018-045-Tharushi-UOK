package com.codebind;

import javax.swing.*;

public class signup extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton clearButton;
    private JButton signUpButton;
    private JLabel titleSignup;
    private JPanel mainFrame;

    signup()
    {
        super("Signup form");
        this.setContentPane(mainFrame);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }


}
