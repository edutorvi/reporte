/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejmreprte;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mtorrel
 */
public class Conexion{
    public Connection conectar(){
    Connection conn = null;
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/municipalidad",
    "root", "");
    System.out.println("Conectado");
    } catch(ClassNotFoundException|SQLException e){
    System.out.println(e.getMessage());
    }
    return conn;
    }
}

