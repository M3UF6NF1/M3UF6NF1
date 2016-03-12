/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3uf6nf1ex4;

/**
 *
 * @author marc
 */
public class Assignatura {
    /*Atributs*/
    private String nom;
    private int credits;
    private String descripcio;
    private String dniProfessor;
    
    /*Constructors*/
    public Assignatura (String n, int c, String des, String dniP)
    {
        nom = n;
        credits = c;
        descripcio = des;
        dniProfessor = dniP;
    }
    public Assignatura (String dniP)
    {
        dniProfessor = dniP;
    }
    
    /*Metodes*/
    public void setNom(String n){
        nom = n;
    }
    public void setCredits(int c){
        credits = c;
    }
    public void setDescripcio(String d){
        descripcio = d;
    }
    public void setDniProfessor(String p){
        dniProfessor = p;
    }
    public String getNom(){
        return nom;
    }
    public int getCredits(){
        return credits;
    }
    public String getDescripcio(){
        return descripcio;
    }
    public String getDniProfessor(){
        return dniProfessor;
    }
}
