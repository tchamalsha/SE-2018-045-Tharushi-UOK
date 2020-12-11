package com.codebind;

import javax.print.DocFlavor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {
    public static ResultSet resultSet;

    void save(int vehicleNumber,String year,String model,String condition)
    {

        String sqlQuery="insert into vehicle "+"(Vehi_number,Year,Model,Conditions)"+"values("+vehicleNumber+','+'\''+year+'\''+','+'\''+model+'\''+','+'\''+condition+'\''+")";
        this.sqlConnection(sqlQuery);
    }
    void update(int vehicleNumber,String year,String model,String condition)
    {

        String sqlQuery="update vehicle set "+
                "vehi_number="+vehicleNumber+','+"year="+'\''+year+'\''+','+"model="+'\''+model+'\''+','+"conditions="+'\''+condition+'\''+
                "where vehi_number=  "+vehicleNumber;
        this.sqlConnection(sqlQuery);
    }
    void delete(int vehicleNumber)
    {

        String sqlQuery= "delete from vehicle where vehi_number="+vehicleNumber;
        this.sqlConnection(sqlQuery);
    }
    ResultSet search(int vehicleNumber)
    {
        String url="jdbc:mysql://localhost:3306/Vehicles";
        String user="root";
        String password="tharushi";

        try {
            Connection myConnection = DriverManager.getConnection(url,user,password);
            Statement myStatement = myConnection.createStatement();
            String sqlQuery="Select * from vehicle where vehi_number="+vehicleNumber;
            ResultSet rawResult= myStatement.executeQuery(sqlQuery);
            resultSet=rawResult;
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultSet;
    }
    void sqlConnection(String sqlQuery)
    {
        String url="jdbc:mysql://localhost:3306/Vehicles";
        String user="root";
        String password="tharushi";

        try {
            Connection myConnection = DriverManager.getConnection(url,user,password);
            Statement myStatement = myConnection.createStatement();
            myStatement.executeUpdate(sqlQuery);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
