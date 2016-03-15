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
        
        Interficie window = new Interficie();
        window.setVisible(true);
        
        /*while (sortida == false){
            System.out.println("(0) Sortir, (1)Afegir Estudiant, (2) Afegir Assignatura, (3) Afegir Professor, "
                    + "(4) Mostrar Estudiants, (5) Mostrar Professors");
            opcio = yuna.nextInt();
            switch(opcio){
                case 0:
                    sortida = true;
                    break;
                case 1:
                    afegirEstudiant();
                    break;
                case 2:
                    afegirAssignatura();
                    break;
                case 3:
                    afegirProfessor();
                    break;
                case 4:
                    mostrarEstudiant();
                    break;
                case 5:
                    mostrarProfessor();
                    break;
                case 6:
                    mostrarAssignaturesProfessor();
                    break;
            }
        }*/
    }
    
    public void afegirEstudiant()throws Exception{
        Scanner auron = new Scanner(System.in);
        System.out.println("Introdueix els valors de: nom dni adreça");
        String nom = auron.next();
        String dni = auron.next();
        String adreça = auron.nextLine();
        Estudiant e = new Estudiant(nom,dni,adreça);
        gestor.afegirEstudiant(e);
    }
    public void afegirProfessor()throws Exception{
        Scanner auron = new Scanner(System.in);
        System.out.println("Introdueix els valors de: nom dni departament");
        String nom = auron.next();
        String dni = auron.next();
        String departament = auron.next();
        Professor p = new Professor(nom,dni,departament);
        gestor.afegirProfessor(p);
    }
    public void afegirAssignatura()throws Exception{
        Scanner auron = new Scanner(System.in);
        System.out.println("Introdueix els valors de: assignatura crèdits descipcio dniProfessor");
        String nom = auron.next();
        int credit = auron.nextInt();
        String descripcio = auron.next();
        String dniProfessor = auron.next();
        Assignatura a = new Assignatura(nom,credit,descripcio,dniProfessor);
        gestor.afegirAssignatura(a);
    }
    public void mostrarEstudiant() throws Exception{
        gestor.mostrarEstudiant();
    }
    public void mostrarProfessor() throws Exception{
        gestor.mostrarProfessor();
    }
    public void mostrarAssignaturesProfessor() throws Exception{
        Scanner auron = new Scanner(System.in);
        System.out.println("Introdueix el dni del Professor per saber les Assignatures que imparteix:");
        String dniProfessor = auron.next();
        gestor.mostrarAssignaturesProfessor(dniProfessor);
    }
}
