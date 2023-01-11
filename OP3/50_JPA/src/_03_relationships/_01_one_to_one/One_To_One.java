package _03_relationships._01_one_to_one;


import _03_relationships.JpaStarter;

import java.util.List;

import static _03_relationships.JpaStarter.em;


public class One_To_One {


    public static void main( String[] args ) {
        JpaStarter.init("REL"); // REL ist der Name der Persistence Unit (siehe persistence.xml)
        // =================================
        //JpaStarter.launch(One_To_One::writeTestData);
        // =================================
        JpaStarter.launch(One_To_One::readTest);
        // =================================
        //JpaStarter.launch(One_To_One::neuePersonNeuerAusweis);
        //JpaStarter.launch(One_To_One::existPersonExistAusweis);
        //JpaStarter.launch(One_To_One::neuePersonExistAusweis);
        // =================================
        JpaStarter.launch(One_To_One::readTest);
        // =================================
        JpaStarter.stop();
    }
    // ===============================================================================
    private static void readTest() {
        List<Person> personList = em.createQuery("SELECT p FROM Person p", Person.class)
                .getResultList();
        personList.forEach(p -> System.out.println(p + " - " + p.getPersonalAusweis()));
        System.out.println("=====================");
        em.createQuery("SELECT a FROM Ausweis a", Ausweis.class)
                .getResultList()
                .forEach(System.out::println);
    }
    // ===============================================================================
    private static void writeTestData() {
        Generator.getPersonList().forEach(em::persist);
        Generator.getAusweisList().forEach(em::persist);
    }
    // ===============================================================================
    private static void neuePersonNeuerAusweis() {
        Person person = Generator.getPerson(4);     // Selbst erstellt
        Ausweis ausweis = Generator.getAusweis(4);  // Selbst erstellt
        // =================================
        person.setPersonalAusweis(ausweis);
        // =================================
        //em.persist(ausweis);
        em.persist(person);
        // =================================
    }
    // ===============================================================================
    private static void neuePersonExistAusweis() {
        Person person = Generator.getPerson(4); // Selbst erstellt
        Ausweis ausweis = em.find(Ausweis.class, 502); // ID=502
        person.setPersonalAusweis(ausweis);
        em.persist(person);
    }
    // ===============================================================================
    private static void existPersonExistAusweis() {
        Person person = em.find(Person.class, 3);      // ID=3
        Ausweis ausweis = em.find(Ausweis.class, 502); // ID=502
        // =================================
        person.setPersonalAusweis(ausweis);
        //ausweis.setPerson(person); // optional
    }
    // ===============================================================================


}
