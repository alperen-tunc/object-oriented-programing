package vorlesung;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Operations
{
    private static final String DB_URL = "jdbc:mariadb://localhost:3307/op3_db";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "1234";

    public static void main(String[] args) throws Exception
    {
        jdbcSelect();
    }
    private static void  jdbcSelect() throws Exception
    {
        Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM op3_db.person");

        while (rs.next())
        {
            Long id = rs.getLong("ID");
            String vorname = rs.getString("VORNAME");
            String nachname = rs.getString("NACHNAME");
            System.out.printf("(%d) - %s %s\n", id, vorname, nachname);

        }

        con.close();

    }
}
