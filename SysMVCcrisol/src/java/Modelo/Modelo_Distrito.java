/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Entidad.Distrito;
import Interface.Interface_Distrito;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Documentos
 */
public class Modelo_Distrito implements Interface_Distrito{
    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    Conexion cnx = new Conexion();
    Distrito dis;

    @Override
    public List ListadoDistrito() {
String sql = "select * from distrito;";
        ArrayList<Distrito> Lista = new ArrayList<>();
        try{
            con = cnx.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                dis = new Distrito();
                dis.setId(rs.getInt("id_dis"));
                dis.setNom(rs.getString("nom_dis"));

                Lista.add(dis);
            }
            
        }
        catch(Exception e){
            
        }
        return Lista;    }

    @Override
    public boolean IngresarDistrito(Distrito dis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ModificarDistrito(Distrito dis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean EliminarDistrito(int idDis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Distrito BuscarDistrito(int idDis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
