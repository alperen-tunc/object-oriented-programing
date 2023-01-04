package _02_one2many;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static vorlesung.DatabaseConfig.*;

public class R2_one2Many
{
    public static void main(String[] args) throws Exception
    {
        readPersonsWithAssignedKfz();
    }

    private static void readPersonsWithAssignedKfz() throws Exception
    {
        System.out.println();

        Connection con = DriverManager.getConnection(DB_URL2, DB_USERNAME, DB_PASSWORD);
        Statement stmt = con.createStatement();
        String sqlSelect = "Select * from PERSON_KFZ_VIEW";
        ResultSet rs = stmt.executeQuery(sqlSelect);

        List<Person> personList = new ArrayList<>();
        Person person = new Person(-1L, null, null);

        while(rs.next())
        {
            Long personID = rs.getLong("person_id");
            String vorname = rs.getString("vorname");
            String nachname = rs.getString("nachname");

            if (!personID.equals(person.getId()))
            {
                person = new Person(personID, vorname, nachname);
                personList.add(person);
            }

            Long kfzId = rs.getLong("kfz_id");
            /*if (kfzId == 0)
                continue;*/

            String hersteller = rs.getString("HERSTELLER");
            String model = rs.getString("modell");
            Kfz kfz = new Kfz(kfzId, hersteller, model);
            person.add(kfz);

            System.out.println(personID + "- " + vorname + " " + nachname + " "+ kfzId + " " + hersteller+ " " + model);
        }
        con.close();
        System.out.println();
        personList.forEach(Person::printInfo);
    }
}
