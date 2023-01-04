/*
 * Copyright (c) 2023.
 * 4.1.2023
 * Salah Lejmi
 */

package aufgaben.aufgabe_2.lösung_2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static vorlesung.DatabaseConfig.*;

public class One2One {
  
  public static void main( String[] args ) throws Exception {
    readPersonWithAssignedAusweis();
  }
  
  private static void readPersonWithAssignedAusweis() throws Exception {
    System.out.println("===================================================");
    System.out.println("=           Person <= One2One => Ausweis          =");
    System.out.println("===================================================");
    Connection con = DriverManager.getConnection(DB_URL3, DB_USERNAME, DB_PASSWORD);
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM PERSON_PA"); // View
    List<Person> personList = new ArrayList<>();
    Person person = new Person(-1L, null, null);
    while ( rs.next() ) {
      Long personId = rs.getLong("PERSON_ID");
      String vorname = rs.getString("VORNAME");
      String nachname = rs.getString("NACHNAME");
      //System.out.format("(%d) - %s %s%n", personId, vorname, nachname);
      // Wenn gleiche ID wie vorheriger Datensatz dann keine neues Person-Objekt erstellen.
      if (!personId.equals(person.getId())) {
        person = new Person(personId, vorname, nachname);
        personList.add(person);
      }
      // ==============================================================
      Long paId = rs.getLong("PA_ID");
      if (paId == 0)
        continue;
      String nummer = rs.getString("NUMMER");
      Date ausgestellt = rs.getDate("AUSGESTELLT");
      Date gültig = rs.getDate("GÜLTIG");
      //System.out.format("(%d) - %s %s - %s%n", paId, hersteller, modell);
      PersonalAusweis pa = new PersonalAusweis(paId, nummer, ausgestellt, gültig);
      person.setPersonalAusweis(pa);
    }
    con.close();
    personList.forEach(Person::printInfo);
  }
  
}
