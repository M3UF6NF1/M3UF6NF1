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
public class Estudiant {
    /*Atributs*/
    private String nom;
    private String dni;
    private String adreça;
    
    /*Constructors*/
    public Estudiant (String n, String d, String a)
    {
        nom = n;
        dni = d;
        adreça = a;
    }
    
    /*Metodes*/
    public String getNom(){
        return nom;
    }
    public String getDni(){
        return dni;
    }
    public String getAdreça(){
        return adreça;
    }
    public void setNom(){
        nom = InsertarEstudiants.nomEstudiantField.getText();
    }
    public void setDni(){
        dni = InsertarEstudiants.dniEstudiantField.getText();
    }
    public void setAdreça(){
        adreça = InsertarEstudiants.adreçaEstudiantField.getText();
    }
}
