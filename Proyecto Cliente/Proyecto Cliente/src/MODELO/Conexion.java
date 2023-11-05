//
//package MODELO;
//
//import com.mysql.jdbc.PreparedStatement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.*;
//import javax.swing.JOptionPane;
//
///**
// *
// * @author alexb
// */
//public class Conexion {
//    
//
//    private static final String URL = "jdbc:mysql://localhost:3306/ chat ?autoReconnect=true&useSSL=false";
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "123456789";
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
//}
