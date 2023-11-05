///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Conexion;
//
//import com.mysql.jdbc.PreparedStatement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import javax.swing.JOptionPane;
//
///**
// *
// * @author alexb
// */
//public class conexion {
//    
//
//    private static final String URL = "jdbc:mysql://localhost:3306/proyecto_progra_3?autoReconnect=true&useSSL=false";
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "Dr4g0n0323";
//
//    PreparedStatement ps;
//    ResultSet rs;
//
//    public static Connection getConnection() {
//
//        Connection cone = null;
//
//        try {
//
//            Class.forName("com.mysql.jdbc.Driver");
//            cone = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//            JOptionPane.showMessageDialog(null, "CONEXION EXITOSA");
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "error de coneccion getconeccion");
//        }
//
//        return cone;
//    }
//    
//
//    
//    
//    
//    public static void main(String[] args) {
//    }
//}
//
