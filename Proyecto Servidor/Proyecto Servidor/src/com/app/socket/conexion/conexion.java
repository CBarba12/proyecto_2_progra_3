/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.socket.conexion;

import com.mysql.jdbc.PreparedStatement;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author alexb
 */
public class conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/proyecto_progra_3?autoReconnect=true&useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456789";

    PreparedStatement ps;
    ResultSet rs;

    public static Connection getConnection() {

        Connection cone = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            cone = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("CONEXION EXITOSA A LA BASE DE DATOS");

        } catch (Exception e) {
             System.out.println( "error de coneccion getconeccion");
        }

        return cone;
    }

}
