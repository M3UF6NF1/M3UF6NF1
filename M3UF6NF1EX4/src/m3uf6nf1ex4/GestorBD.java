package m3uf6nf1ex4;

import java.sql.* ;

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
    }
    public void afegirProfessor(Professor p) throws Exception {
        Statement update = c.createStatement();
        String valors = "'" + p.getNom() + "','" + p.getDni() + "','" + p.getDepartament() + "'";
        update.executeUpdate("INSERT INTO Professor VALUES(" + valors + ")");
    }
    public void afegirAssignatura(Assignatura a) throws Exception {
        Statement update = c.createStatement();
        String valors = "'" + a.getNom() + "','" + a.getCredits() + "','" + a.getDescripcio() + "'";
        update.executeUpdate("INSERT INTO Assignatura VALUES(" + valors + ")");
    }
    public void mostrarAssignatures(Professor assign) throws Exception {
        Statement update = c.createStatement();
        }
}
        

