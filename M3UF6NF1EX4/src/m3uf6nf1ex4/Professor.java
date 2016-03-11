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
public class Professor {
    /*Atributs*/
    private String nom;
    private String dni;
    private String departament;
    
    /*Constructors*/
    public Professor (String n, String d, String dep)
    {
        nom = n;
        dni = d;
        departament = dep;
    }
    
    /*Metodes*/
    public String getNom(){
        return nom;
    }
    public String getDni(){
        return dni;
    }
    public String getDepartament(){
        return departament;
    }
}
