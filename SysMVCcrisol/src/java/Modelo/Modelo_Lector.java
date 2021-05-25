/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Entidad.Lector;
import Interface.Interface_Lector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Documentos
 */
public class Modelo_Lector implements Interface_Lector {
    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    Conexion cnx = new Conexion();
    Lector lec;
    @Override
    public List ListadoLector() {
        String sql = "call usp_listaLector();";
        ArrayList<Lector> Lista = new ArrayList<>();
        try{
            con = cnx.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                lec = new Lector();
                lec.setId(rs.getInt("id_lec"));
                lec.setNom(rs.getString("nom_lec"));
                lec.setApe((rs.getString("ape_lec")));
                lec.setDni(rs.getString("DNI"));
                lec.setFec(rs.getString("fec_reg"));
                lec.setNomDis(rs.getString("nom_dis"));
                lec.setEst(rs.getString("est_lec"));
                Lista.add(lec);
            }
            
        }
        catch(Exception e){
            
        }
        return Lista;
    }

    @Override
    public boolean IngresarLector(Lector lec) {
        String sql = "call usp_ingresaLector('"+lec.getNom()+"','"+lec.getApe()+"','"+lec.getDni()+"','"+lec.getIdDis()+"','"+lec.getFec()+"','"+lec.getEst()+"');";
        try{
            con = cnx.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    @Override
    public boolean ModificarLector(Lector lec) {
        String sql = "call usp_ingresaLector("+lec.getId()+",'"+lec.getNom()+"','"+lec.getApe()+"','"+lec.getDni()+"','"+lec.getIdDis()+"','"+lec.getFec()+"','"+lec.getEst()+"');";
        try{
            con = cnx.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            return true;
        }
        catch(Exception e){
            return false;
        }    }

    @Override
    public boolean EliminarLector(int idlec) {
        String sql = "call usp_eliminaLector("+idlec+");";
        try{
            con = cnx.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    @Override
    public Lector BuscarLector(int idlec) {
        String sql = "call usp_BuscarxIdLector("+idlec+")";
        
        try{
            con = cnx.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                lec = new Lector();
                lec.setId(rs.getInt("id_lec"));
                lec.setNom(rs.getString("nom_lec"));
                lec.setApe((rs.getString("ape_lec")));
                lec.setDni(rs.getString("DNI"));
                lec.setFec(rs.getString("fec_reg"));
                lec.setNomDis(rs.getString("nom_dis"));
                lec.setEst(rs.getString("est_lec"));
                
            }
            
        }
        catch(Exception e){
            
        }
        return lec;
    }
    
}
