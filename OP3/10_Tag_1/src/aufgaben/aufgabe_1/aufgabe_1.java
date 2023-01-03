package aufgaben.aufgabe_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class aufgabe_1
{
    public static void main(String[] args) throws Exception
    {
        jdbcSelect();
    }
    private static final String DB_URL = "jdbc:mariadb://localhost:3307/verwaltung";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "1234";
    private static void  jdbcSelect() throws Exception
    {
        Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM verwaltung.mitarbeiter");

        while (rs.next())
        {
            String id = rs.getString("mitarbeiternummer");
            String vorname = rs.getString("mitarbeitername");
            String berechtigung = rs.getString("maschinenberechtigung");
            System.out.printf("(%s) - %s - %s\n", id, vorname, berechtigung);
        }

        con.close();

    }
}
