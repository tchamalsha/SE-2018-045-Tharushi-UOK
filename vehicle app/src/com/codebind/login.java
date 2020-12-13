package com.codebind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    private JLabel title;
    private JTextField textField1;
    private JLabel usernameField;
    private JPasswordField textField2;
    private JLabel passwordField;
    private JPanel mainPanel;
    private JButton loginButton;
    public static String userName;
    public static String password;


    login(){
        super("Vehicle app");
        this.setContentPane(this.mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userName=textField1.getText();
                password=String.valueOf(textField2.getPassword());
            }
        });
    }



}
