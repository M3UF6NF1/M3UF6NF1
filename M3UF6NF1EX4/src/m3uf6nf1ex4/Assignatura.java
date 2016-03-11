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
    
    /*Constructors*/
    public Assignatura (String n, int c, String des)
    {
        nom = n;
        credits = c;
        descripcio = des;
    }
    
    /*Metodes*/
    public String getNom(){
        return nom;
    }
    public int getCredits(){
        return credits;
    }
    public String getDescripcio(){
        return descripcio;
    }
}
