package Aufgaben.aufgabe_4;

import java.util.ArrayList;
import java.util.List;

public class PersonService
{
    private int nextId = 1;
    private List<Person> personList = new ArrayList<>();

    public void save(Person p)
    {
        p.setId(nextId);
        personList.add(p);
        nextId++;
    }

    public List<Person> getPersonList()
    {
        return personList;
    }
}
