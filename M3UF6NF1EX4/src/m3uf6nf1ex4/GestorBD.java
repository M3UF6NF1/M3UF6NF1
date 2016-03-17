package m3uf6nf1ex4;

import java.awt.List;
import java.sql.* ;
import java.util.ArrayList;

public class GestorBD {
    /*Atributs*/
    private Connection c;
    
    /*Constructor*/
    public GestorBD() throws Exception {
        //Carregar el controlador per la BD Apache Derby
        Class.forName("org.apache.derby.jdbc.ClientDriver");

        //Establir la connexió
        String urlBaseDades = "jdbc:derby://localhost:1527/UF6NF1Ex4";
        String usuari = "alumne";
        String contrasenya = "alumne";

        c = DriverManager.getConnection(urlBaseDades , usuari, contrasenya);
    }
    
    public void afegirEstudiant(Estudiant e) throws Exception {
        Statement update = c.createStatement();
        String valors = "'" + e.getNom() + "','" + e.getDni() + "','" + e.getAdreça() + "'";
        update.executeUpdate("INSERT INTO Estudiant VALUES(" + valors + ")");
        c.close();
    }
    public void afegirProfessor(Professor p) throws Exception {
        Statement update = c.createStatement();
        String valors = "'" + p.getNom() + "','" + p.getDni() + "','" + p.getDepartament() + "'";
        update.executeUpdate("INSERT INTO Professor VALUES(" + valors + ")");
        c.close();
    }
    public void afegirAssignatura(Assignatura a) throws Exception {
        Statement update = c.createStatement();
        String valors = "'" + a.getNom() + "'," + a.getCredits() + ",'" + a.getDescripcio() + ",'" + a.getDniProfessor() + "'";
        update.executeUpdate("INSERT INTO Assignatura VALUES(" + valors + ")");
        c.close();
    }
    public void mostrarEstudiant() throws Exception {
        Statement buscar = c.createStatement();
        ResultSet r = buscar.executeQuery("select * from estudiant order by nom ASC");
        while (r.next()){
            System.out.println("Nom: "+r.getString("nom")+ ", dni: "+r.getString("dni")+", Adreça: "+r.getString("adreça"));
        }
        c.close();
    }
    public void mostrarProfessor() throws Exception {
        Statement buscar = c.createStatement();
        ResultSet r = buscar.executeQuery("select * from professor order by nom ASC");
        while (r.next()){
            System.out.println("Nom: "+r.getString("nom")+ ", dni: "+r.getString("dni")+", Departament: "+r.getString("departament"));
        }
        c.close();
    }
    public ArrayList mostrarAssignaturesProfessor(String dni) {
        try{
            Statement buscar = c.createStatement();

            ResultSet r = buscar.executeQuery("SELECT * FROM Assignatura WHERE dni_professor = '"+dni+"'");

            ArrayList assignaturesProfessor= new ArrayList();

            while (r.next()){
            String nom = r.getString("nom");
            int credits = r.getInt("credits");
            String descripcio = r.getString("descipció");
            String dni_professor = r.getString("dni_professor");
            
            //System.out.println(nom+credits+descripcio+dni_professor);

            Assignatura o = new Assignatura(nom, credits, descripcio, dni_professor);
            assignaturesProfessor.add(o.getNom()+" | "+o.getCredits()+" | "+o.getDescripcio()+" | "+o.getDniProfessor()+"\n");

          }
            System.out.println(assignaturesProfessor);
          if(assignaturesProfessor == null){
                c.close();
                return null;
          }else{
                c.close();
                return assignaturesProfessor;
            }
        }catch(Exception e){
            System.out.print(e);
            return null;
        }
    }

    
    public ArrayList cercarDni(){
        try{
            Statement buscar = c.createStatement();
            ResultSet r = buscar.executeQuery("select dni_Professor from assignatura");
            ArrayList dniProf= new ArrayList();
            while (r.next()){
                String dni = r.getString("dni_Professor");
                dniProf.add(dni);
              }
            if(dniProf == null){
                return null;
            }else{
                return dniProf;
            }
        }catch(Exception e){
            System.out.print(e);
            return null;
        }
    }
}

        

