package _01_simple;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static vorlesung.DatabaseConfig.*;

public class R1_Simple
{

  public static void main( String[] args ) throws Exception
  {
    //jdbcInsert();
    jdbcUpdate();
    //jdbcDelete();
    jdbcSelect();
  }
  
  //============================= SQL Examples =============================
  /*  CRUD: Create, Read, Update, Delete
        CREATE ===> INSERT INTO PERSON (FIRST_NAME, LAST_NAME) VALUES ('Peter','Schmidt');
        READ   ===> SELECT * FROM PERSON;
        UPDATE ===> UPDATE PERSON SET LAST_NAME='Schmitz' WHERE ID=1;
        DELETE ===> DELETE FROM PERSON WHERE ID=3
  */
  private static void jdbcSelect() throws Exception
  {
    System.out.println("===================================================");
    System.out.println("=                Read with JDBC                   =");
    System.out.println("===================================================");
    // Vor JDBC 4.0, Treiber in die JVM manuell laden
    // Class.forName("org.mariadb.jdbc.Driver");
    // 1. Verbindung zur Datenbank aufbauen
    Connection con = DriverManager.getConnection(DB_URL1, DB_USERNAME, DB_PASSWORD);
    // 2. Statement erstellen
    Statement stmt = con.createStatement();
    // 3. Abfrage schicken und ResultSet bekommen
    ResultSet rs = stmt.executeQuery("SELECT * FROM PERSON");
    // 4. ResultSet iterieren und Daten auslesen (Objekte bilden)
    List<Person> personList = new ArrayList<>();
    while ( rs.next() ) {
      Long id = rs.getLong("ID");
      String vorname = rs.getString("VORNAME");
      String nachname = rs.getString("NACHNAME");
      //System.out.format("(%d) - %s %s%n", id, vorname, nachname);
      Person person = new Person(id, vorname, nachname);
      personList.add(person);
    }
    con.close();
    personList.forEach(System.out::println); // Person.toString()
  }
  
  private static void jdbcInsert() throws Exception
  {
    System.out.println("===================================================");
    System.out.println("=               Create with JDBC                  =");
    System.out.println("===================================================");
    Person person = new Person(5L, "Martin", "Kunz"); // z.B. aus Formular
    Connection con = DriverManager.getConnection(DB_URL1, DB_USERNAME, DB_PASSWORD);
    //String sqlInsert = "INSERT INTO PERSON (ID, VORNAME, NACHNAME) VALUES (4, 'Salah', 'Lejmi')";
    //                                                                     1  2  3
    String sqlInsert = "INSERT INTO PERSON (ID, VORNAME, NACHNAME) VALUES (?, ?, ?)";
    PreparedStatement stmt = con.prepareStatement(sqlInsert);
    // Platzhalter (?) mit Werten ersetzen
    stmt.setLong(1, person.getId());
    stmt.setString(2, person.getVorname());
    stmt.setString(3, person.getNachname());
    // SQL-Anweisung abschicken
    stmt.executeUpdate();
    con.close();
  }
  
  private static void jdbcUpdate() throws Exception
  {
    System.out.println("===================================================");
    System.out.println("=               Update with JDBC                  =");
    System.out.println("===================================================");
    Person person = new Person(2L, "Hans", "Maier");
    Connection con = DriverManager.getConnection(DB_URL1, DB_USERNAME, DB_PASSWORD);
    PreparedStatement stmt = con.prepareStatement("UPDATE PERSON SET NACHNAME=? WHERE id=?");
    stmt.setString(1, person.getNachname());
    // UPDATE PERSON SET LAST_NAME='Maier' WHERE ID=?
    stmt.setLong(2, person.getId());
    // UPDATE PERSON SET LAST_NAME='Maier' WHERE ID=2
    stmt.executeUpdate();
    con.close();
  }
  
  private static void jdbcDelete() throws Exception
  {
    System.out.println("===================================================");
    System.out.println("=               Delete with JDBC                  =");
    System.out.println("===================================================");
    Connection con = DriverManager.getConnection(DB_URL1, DB_USERNAME, DB_PASSWORD);
    String sqlDelete = "DELETE FROM PERSON WHERE NACHNAME=?";
    PreparedStatement stmt = con.prepareStatement(sqlDelete);
    stmt.setString(1, "Lejmi");
    // =>               DELETE FROM PERSON WHERE NACHNAME='Lejmi'
    stmt.executeUpdate();
    con.close();
  }
}
