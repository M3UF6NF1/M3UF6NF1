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
        
        M3UF6NF1EX4 classePrincipal = new M3UF6NF1EX4();
        classePrincipal.start();
    }
    public void start() throws Exception{
        Scanner yuna = new Scanner(System.in);
        /*Atributs*/
        boolean sortida = false;
        int opcio;
        gestor = new GestorBD();
        
        while (sortida == false){
            System.out.println("(0) Sortir, (1)Afegir Estudiant, (2) Afegir Assignatura, (3) Afegir Professor.");
            opcio = yuna.nextInt();
            switch(opcio){
                case 0:
                    sortida = true;
                case 1:
                    afegirEstudiant();
                case 2:
                    afegirAssignatura();
                case 3:
                    afegirProfessor();
            }
        }
        afegirEstudiant();
        
    }
    
    public void afegirEstudiant()throws Exception{
        Estudiant e = new Estudiant("Anna","12345678P","carrer 1");
        gestor.afegirEstudiant(e);
    }
    public void afegirProfessor()throws Exception{
        Professor p = new Professor("Raquel","12345678I","Deportiu");
        gestor.afegirProfessor(p);
    }
    public void afegirAssignatura()throws Exception{
        Assignatura a = new Assignatura("Català",6,"Llengua Catalana");
        gestor.afegirAssignatura(a);
    }
}
