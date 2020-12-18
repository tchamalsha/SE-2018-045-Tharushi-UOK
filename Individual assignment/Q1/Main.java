package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Box box=new Box(10,5,5,2600);
        int volume=box.calculateVolume();
        double density=box.calculateDensity();
        System.out.println("Volume of the box is: "+volume);
        System.out.println("Density of the box: "+density);

    }
}
