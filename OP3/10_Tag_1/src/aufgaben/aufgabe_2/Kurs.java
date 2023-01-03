package aufgaben.aufgabe_2;

import java.util.ArrayList;
import java.util.List;

public class Kurs
{
    private String kursName;
    private int kursId;
    private List<Student> studentList = new ArrayList<>();
    private String semester;

    public Kurs(String kursName, int kursId, String semester)
    {
        this.kursName = kursName;
        this.kursId = kursId;
    }

    public void add(Student s)
    {
        studentList.add(s);
    }
}
