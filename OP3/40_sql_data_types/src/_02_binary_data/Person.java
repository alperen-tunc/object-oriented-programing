package _02_binary_data;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

// Entity-Klasse: Daten-Container
public class Person {
    // Variablen
    private Long id;
    private String vorname;
    private String nachname;
    private byte[] photo;
    // Konstruktoren

    public Person() { }

    public Person( Long id, String vorname, String nachname ) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
    }
    // Getter- und Setter-Methoden
    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname( String vorname ) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname( String nachname ) {
        this.nachname = nachname;
    }
    // equals() / hashCode()

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto( byte[] photo ) {
        this.photo = photo;
    }

    public Path getPhotoFilename() {
        String filename = String.format("%d-%s-%s.%s", id, vorname, nachname, getExtention());
        // 1-Beauty-Schlumpf.jpeg
        return Paths.get(filename);
    }

    private String getExtention()  {
        InputStream is = new ByteArrayInputStream(photo);
        String mimeType = null;
        try {
            mimeType = URLConnection.guessContentTypeFromStream(is);
            is.close();
        } catch ( IOException e ) {
            throw new RuntimeException(e);
        }
        // image/jpeg => jpeg
        return mimeType.substring(mimeType.indexOf('/') + 1);
    }


    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    // toString()
    @Override
    public String toString() {
        return String.format("(%d) - %-25s - Photo: %s", id, vorname + " " + nachname, getPhotoFilename());
    }

}