package _02_binary_data;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
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
        readBinary();
    }

    private static void readBinary() throws Exception {
        System.out.println("===================================================");
        System.out.println("=                Read with JDBC                   =");
        System.out.println("===================================================");
        Connection con = DriverManager.getConnection(urlTo("BinaryData"), DB_USERNAME, DB_PASSWORD);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM PERSON");
        List<Person> personList = new ArrayList<>();
        while ( rs.next() ) {
            Long id = rs.getLong("ID");
            String vorname = rs.getString("VORNAME");
            String nachname = rs.getString("NACHNAME");
            Person person = new Person(id, vorname, nachname);
            // ================================================
            byte[] photo = rs.getBytes("PHOTO");
            person.setPhoto(photo);
            // ================================================
            //savePhotoToFileSystem(person);
            //viewPhotoWithSwing(person);
            personList.add(person);
        }
        con.close();
        personList.forEach(ReadWriteBinary::viewPhotoWithSwing); // Person.toString()
        personList.forEach(ReadWriteBinary::savePhotoToFileSystem); // Person.toString()
    }

    private static void viewPhotoWithSwing( Person person ) {
        byte[] image = person.getPhoto();
        Image img = Toolkit.getDefaultToolkit().createImage(image);
        JLabel photoLabel = new JLabel( new ImageIcon(img) );
        photoLabel.setText(person.getFullname());
        JOptionPane.showMessageDialog(null, photoLabel);
    }

    private static void savePhotoToFileSystem( Person person ) {
        try {
            // Photo wird in eine Datei gespeichert
            Files.write(person.getPhotoFilename(), person.getPhoto());
        } catch ( IOException e ) {}
    }

    private static void writeBinary() throws Exception {
        System.out.println("===================================================");
        System.out.println("=               Create with JDBC                  =");
        System.out.println("===================================================");
        Person person = new Person(7L, "Alperen", "Tunc"); // z.B. aus Formular
        Connection con = DriverManager.getConnection(urlTo("BinaryData"), DB_USERNAME, DB_PASSWORD);
        String sqlInsert = "INSERT INTO PERSON (ID, VORNAME, NACHNAME, PHOTO) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sqlInsert);
        stmt.setLong(1, person.getId());
        stmt.setString(2, person.getVorname());
        stmt.setString(3, person.getNachname());
        // ================================================================
        Path photoPath = getPapaSchlumpfPhoto();
        //Path photoPath = getFromFileSystem();
        byte[] photo = Files.readAllBytes(photoPath);
        stmt.setBytes(4, photo);
        // ================================================================
        stmt.executeUpdate();
        con.close();
    }

    private static Path getPapaSchlumpfPhoto() {
        URL url = ReadWriteBinary.class.getResource("images_1/Handy_Smurf.jpg");
        String path = url.getPath().replaceFirst("/", "");
        System.out.println("path: " + path);
        return Path.of(path);
    }

    private static Path getFromFileSystem() {
        URL url = ReadWriteBinary.class.getResource(".");
        String dir = url.getFile();
        JFileChooser choose = new JFileChooser(dir);
        int res = choose.showOpenDialog(null);
        File file = null;
        if (res == JFileChooser.APPROVE_OPTION) {
            file = choose.getSelectedFile();
            System.out.println(file.getAbsolutePath());
        }
        return file.toPath();
    }



}


