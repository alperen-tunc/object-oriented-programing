package aufgaben.aufgabe_2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static vorlesung.DatabaseConfig.*;

public class main
{
    public static void main(String[] args) throws SQLException
    {
        readDatenAusPersonViewWithAusweisdaten();
    }

    private static void readDatenAusPersonViewWithAusweisdaten() throws SQLException
    {
        System.out.println();

        String sqlSelect = "select * from personViewWithAusweisdaten";

        Connection connection = DriverManager.getConnection(DB_URL3, DB_USERNAME, DB_PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlSelect);

        List<Person> personList = new ArrayList<>();

        while (resultSet.next())
        {
            long person_id = resultSet.getLong("id");
            String vorname = resultSet.getString("vorname");
            String nachname = resultSet.getString("nachname");
            Date geburtsdatum = resultSet.getDate("geburtsdatum");
            String ausweisNummer = resultSet.getString("nummer");
            Date gültigBis = resultSet.getDate("gültig");
            PersonalAusweis personalAusweis = new PersonalAusweis(ausweisNummer, gültigBis);
            Person person = new Person(person_id, vorname, nachname, geburtsdatum, personalAusweis);
            personList.add(person);
        }

        connection.close();
        personList.forEach(System.out::println);
    }
}

