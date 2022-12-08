package _01_mvc.model;

import java.util.ArrayList;
import java.util.List;

public class PersonService
{
    private List<Person> personList = new ArrayList<>();

    public void save(Person person) {
        System.out.println(person + " PersonService.save()");
        personList.add(person);
    }

    public List<Person> getPersonList() {
        System.out.println("PersonService.gelAllPersons()");
        return personList;
    }

    public Person getPersonById(int id) {
        Person person = personList.get(id);
        System.out.println(person + " PersonService.getPersonById()");
        return person; // <===
    }

    public void update(Person person) {
        System.out.println("PersonService.update()");
    }

    public void delete(int id) {
        Person person = personList.get(id);
        System.out.println(person + " PersonService.delete()");
        personList.remove(id);
    }
}
