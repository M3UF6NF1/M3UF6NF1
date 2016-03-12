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
        String urlBaseDades = "jdbc:derby://localhost:1527/M3UF6NF1";
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
        String valors = "'" + a.getNom() + "'," + a.getCredits() + ",'" + a.getDescripcio() + "'";
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
    public void mostrarAssignaturesProfessor(String dni) throws Exception {
        Statement buscar = c.createStatement();
        ResultSet r = buscar.executeQuery("select nom, dni_Professor from assignatura where dni_Professor = '"+dni+"'  order by nom ASC");
        while (r.next()){
            System.out.println("Nom: "+r.getString("nom")+ ", dni Professor: "+r.getString("dni_Professor"));
        }
        c.close();
    }
}
        

