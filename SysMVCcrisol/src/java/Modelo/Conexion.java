/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Documentos
 */
public class Conexion {
    //Propiedad
    Connection con;
    //Métodos

    public Conexion() {
        try{
            // Driver
            Class.forName("com.mysql.jdbc.Driver");
            //Configuración del objeto conexion|
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crisol","root","");
        }catch(Exception e){
            System.out.println("Mensaje : " + e.getMessage());
        }finally{
            System.out.println("Inicio de la aplicación");
        }
    }
    public Connection getCon(){
        return con;
    }
}
