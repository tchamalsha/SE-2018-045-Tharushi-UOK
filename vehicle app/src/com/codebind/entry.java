package com.codebind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    private JButton updateButton;
    private JTextField textField5;
    private JButton deleteButton;

    entry(){
        super("Infromation entry from");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DB fromDatabase=new DB();
                vehicle vehicle=new vehicle();
                vehicle.setVehicleNumber(Integer.parseInt(textField1.getText()));
                vehicle.setYear(textField2.getText());
                vehicle.setModel(textField3.getText());
                vehicle.setCondition(textField4.getText());
                fromDatabase.save(vehicle.vehicleNumber,vehicle.year,vehicle.model,vehicle.condition);
                clearContent();

            }
        });
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DB fromDatabase=new DB();
                vehicle vehicle=new vehicle();
                vehicle.setVehicleNumber(Integer.parseInt(textField1.getText()));
                vehicle.setYear(textField2.getText());
                vehicle.setModel(textField3.getText());
                vehicle.setCondition(textField4.getText());
                fromDatabase.update(vehicle.vehicleNumber,vehicle.year,vehicle.model,vehicle.condition);
                clearContent();;
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DB fromDatabase=new DB();
                fromDatabase.delete(Integer.parseInt(textField1.getText()));
                clearContent();
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DB fromDatabase=new DB();
                vehicle vehicle=new vehicle();
                int vehicleNumber=Integer.parseInt(textField5.getText());
                ResultSet resultSet=fromDatabase.search(vehicleNumber);
                while (true)
                {
                    try {
                        if (!resultSet.next()) break;
                        textField1.setText(String.valueOf(resultSet.getInt("vehi_number")));
                        textField2.setText(resultSet.getString("year"));
                        textField3.setText(resultSet.getString("model"));
                        textField4.setText(resultSet.getString("conditions"));
                        textField5.setText("");
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
            }
        });
    }
    void clearContent()
    {
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
    }

    public static void main(String[] args) {
        entry screen =new entry();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        screen.setSize(screenSize.width*1/3, screenSize.height*1/2);
        screen.setVisible(true);
    }
}
