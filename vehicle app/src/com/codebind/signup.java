package com.codebind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user user = new user(textField1.getText(),textField2.getText(),textField3.getText(),textField4.getText(),textField5.getText());


            }
        });
    }

    public static void main(String[] args) {
        signup screen=new signup();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        screen.setSize(screenSize.width*1/2, screenSize.height*3/4);
        screen.setVisible(true);
    }


}
