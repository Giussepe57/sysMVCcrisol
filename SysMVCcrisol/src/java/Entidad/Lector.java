/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Documentos
 */
public class Lector {
    private int id;
   private String nom;
   private String ape;
   private String dni;
   private int idDis;
   private String fec;
   private String est;
   
   private String nomDis;

    public Lector() {
    }

    public Lector(int id, String nom, String ape, String dni, int idDis, String fec, String est, String nomDis) {
        this.id = id;
        this.nom = nom;
        this.ape = ape;
        this.dni = dni;
        this.idDis = idDis;
        this.fec = fec;
        this.est = est;
        this.nomDis = nomDis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getIdDis() {
        return idDis;
    }

    public void setIdDis(int idDis) {
        this.idDis = idDis;
    }

    public String getFec() {
        return fec;
    }

    public void setFec(String fec) {
        this.fec = fec;
    }

    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }

    public String getNomDis() {
        return nomDis;
    }

    public void setNomDis(String nomDis) {
        this.nomDis = nomDis;
    }
}
