package m3uf6nf1ex4;

import java.sql.* ;

public class GestorBD {
    //Carregar el controlador per la BD Apache Derby
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    
    //Establir la connexió
    String urlBaseDades = "jdbc:derby://localhost:1527/UF6NF1Ex4";
    String usuari = "alumne";
    String contrasenya = "alumne";
    
    Connection c = DriverManager.getConnection(urlBaseDades , usuari, contrasenya);
    
    //Enviar una sentència SQL per recuperar els clients
    Statement cerca = c.createStatement();
    ResultSet r = cerca.executeQuery("SELECT * FROM CLIENTS");
    while (r.next()) {
        System.out.println("Nom: " + r.getString("NOM") + ", Adreça: " + r.getString("APOSTAL"));
    }
    //Tancar la connexió
    c.close();
}
        

