package _template_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBC_Test {
  
  public static void main( String[] args ) throws Exception {
    System.out.println("============================================================");
    Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3307/op3_db",
        "root", "1234");
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM produkt");
  
    List<Produkt> produktListe = new ArrayList<>();
    while ( rs.next() ) {
      Long id = rs.getLong("ID");
      String Name = rs.getString("Name");
      double preis = rs.getDouble("Euro_Preis");
      Long herstellerID = rs.getLong("Hersteller_ID");
      Produkt produkt = new Produkt(id, herstellerID, Name, preis);
      produktListe.add(produkt);
    }
    rs.close();
    stmt.close();
    con.close();
    System.out.println("Produktliste");
    for( Produkt produkt : produktListe ) {
      System.out.println(produkt); // Produkt.toString()
    }
    System.out.println("======================= end of main() ======================");
  }
  
  
  
}
