import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MyJDBC
{
    public static void main(String[] args) throws SQLException
    {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/op3_db",
                "root", "1234");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM kunde");


        while ( rs.next() ) {
            System.out.println(rs.getString("vorname"));
        }

        rs.close();
        stmt.close();
        con.close();



        System.out.println("\n\nEnd of Main..");
    }
}
