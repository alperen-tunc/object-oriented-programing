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

    public void update(Person person)
    {
        for(int i=0; i< personList.size(); i++)
        {
            Person p = personList.get(i);
            if (person.getId() == p.getId())
            {
                personList.set(i, person);
            }
        }
    }

    public void delete(int id)
    {
        for(int i=0; i< personList.size(); i++)
        {
            Person person = personList.get(i);
            if (person.getId() == id)
            {
                personList.remove(i);
            }
        }
    }

}
