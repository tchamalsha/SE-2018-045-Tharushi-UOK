package com.codebind;

import java.awt.*;
public class Main {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        login loginScreen=new login();
        loginScreen.setSize(screenSize.width*1/3, screenSize.height*1/3);
        loginScreen.setVisible(true);

        entry entryScreen = new entry();
        entryScreen.setSize(screenSize.width*1/3, screenSize.height*1/2);
        entryScreen.setVisible(true);
    }
}
