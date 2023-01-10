package _02_crud_operationen;

import _01_Entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class _01_Create
{
    public static void main(String[] args)
    {
        Person person = new Person("Klaus", "Holland");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");// siehe persistence.xml
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin(); // Transaktion starten

        em.persist(person); // person ist jetzt im managed-Zustand
        // Nachträgliche Änderungen an person (vor dem commit) werden auch in die Datenbank geschrieben

        // Transaktion abschicken mit tx.commit() oder zurückrollen mit tx.rollback();
        tx.commit();
        em.close();
        emf.close();
        System.out.println("============================================================");
        System.out.println("Person [" + person + "] wurde angelegt.");
    }
}
