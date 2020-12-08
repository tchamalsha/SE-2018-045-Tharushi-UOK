package com.codebind;

import javax.swing.*;
import java.awt.*;

public class login extends JFrame {
    private JLabel title;
    private JTextField textField1;
    private JLabel usernameField;
    private JPasswordField passwordField1;
    private JLabel passwordField;
    private JPanel mainPanel;
    private JButton loginButton;
    private JButton signUpButton;


    login(){
        super("Vehicle app");
        this.setContentPane(this.mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

    }

    public static void main(String[] args) {
            login screen=new login();
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            screen.setSize(screenSize.width*1/4, screenSize.height*1/3);
            screen.setVisible(true);
    }

}
