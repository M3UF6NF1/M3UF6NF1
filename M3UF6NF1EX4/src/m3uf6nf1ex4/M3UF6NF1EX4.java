/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3uf6nf1ex4;
import java.util.Scanner;

/**
 *
 * @author marc
 */
public class M3UF6NF1EX4 {
    private GestorBD gestor;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        
        M3UF6NF1EX4 classePrincipal = new M3UF6NF1EX4();
        classePrincipal.start();
        
    }
    public void start() throws Exception{
        gestor = new GestorBD();
        afegirEstudiant();
    }
    
    public void afegirEstudiant()throws Exception{
        Estudiant e = new Estudiant("Anna","12345678P","kjfañ");
        gestor.afegirEstudiant(e);
    }
}
