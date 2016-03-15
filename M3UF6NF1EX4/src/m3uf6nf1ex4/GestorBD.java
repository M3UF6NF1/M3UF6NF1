package m3uf6nf1ex4;

import java.awt.List;
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
    public void mostrarAssignaturesProfessor(String dni) throws Exception {
        Statement buscar = c.createStatement();
        ResultSet r = buscar.executeQuery("select nom, dni_Professor from assignatura where dni_Professor = '"+dni+"'  order by nom ASC");
        while (r.next()){
            System.out.println("Nom: "+r.getString("nom")+ ", dni Professor: "+r.getString("dni_Professor"));
        }
        c.close();
    }

    public void afegirProfessor(Estudiant p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void afegirProfessors(Estudiant p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void afegirProfessors(Professor p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void afegirEstudiant(Assignatura a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String cercarDni(){
        public List<Dni> cercarDni(String dni) throws Exception {
        Statement cerca = c.createStatement();
        ResultSet r = cerca.executeQuery("SELECT * FROM CLIENTS WHERE NOM='" + nom +
        "'");
        LinkedList<Dni> llista = new LinkedList<Dni>();
        while (r.next()) {
        llista.add(new Assignatura(r.getString("nom"),r.getInt("credits"),r.getString("descripcio"),
                r.getString("dni"),r.getString("TELEFON")));
        }
        return llista;
        }
    }
}
        

