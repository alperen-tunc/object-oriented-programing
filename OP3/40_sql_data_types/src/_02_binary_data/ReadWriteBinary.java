package _02_binary_data;

import javax.swing.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static forConnection.DatabaseConfig.*;

public class ReadWriteBinary
{
    public static void main(String[] args) throws Exception
    {
        writeBinary();
        readData();
    }

    private static void readData() throws Exception
    {
        System.out.println("===================================================");
        System.out.println("=                Read with JDBC                   =");
        System.out.println("===================================================");
        Connection con = DriverManager.getConnection(urlTo("BinaryData"), DB_USERNAME, DB_PASSWORD);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM PERSON");
        List<Person> personList = new ArrayList<>();

        while ( rs.next() )
        {
            Long id = rs.getLong("ID");
            String vorname = rs.getString("VORNAME");
            String nachname = rs.getString("NACHNAME");
            byte[] photo = rs.getBytes("PHOTO");
            Person person = new Person(id, vorname, nachname);
            person.setPhoto(photo);
            Files.write(person.getPhotoFilename(), photo); // Photo wird in eine Datei gespeichert
            personList.add(person);
        }
        con.close();
        personList.forEach(System.out::println); // Person.toString()
    }
    private static void writeBinary() throws Exception {
        System.out.println("===================================================");
        System.out.println("=               Create with JDBC                  =");
        System.out.println("===================================================");
        Person person = new Person(4L, "Papa", "Schlumpf"); // z.B. aus Formular
        Connection con = DriverManager.getConnection(urlTo("BinaryData"), DB_USERNAME, DB_PASSWORD);
        String sqlInsert = "INSERT INTO PERSON (ID, VORNAME, NACHNAME, PHOTO) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sqlInsert);
        stmt.setLong(1, person.getId());
        stmt.setString(2, person.getVorname());
        stmt.setString(3, person.getNachname());
        // ================================================================

        Path photoPath = Paths.get("C:\\Users\\Administrator\\Documents\\GitHub\\object-oriented-programing\\OP3\\40_sql_data_types\\src\\_02_binary_data\\images_1\\Papa_Smurf1.jpg");
        //Path photoPath = getFromFileSystem();
        byte[] photo = Files.readAllBytes(photoPath);
        stmt.setBytes(4, photo);

        // ================================================================
        stmt.executeUpdate();
        con.close();

    }

    private static Path getFromFileSystem() {
        JFileChooser choose = new JFileChooser(".");
        int res = choose.showOpenDialog(null);
        File file = null;
        if (res == JFileChooser.APPROVE_OPTION) {
            file = choose.getSelectedFile();
            System.out.println(file.getAbsolutePath());
        }
        return file.toPath();
    }


}


