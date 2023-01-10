package _02_crud_operationen;

import _01_Entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class _02_Read
{
    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");// siehe persistence.xml
        EntityManager em = emf.createEntityManager();
        //em.getTransaction().begin(); // Transaktion nicht nötig, da Lesezugriff

        String jpqlString = "SELECT p FROM Person p ORDER BY p.id"; // JPQL, kein SQL
        List<Person> personList = em.createQuery(jpqlString, Person.class).getResultList();
        // Alle Entitities sind im managed-Zustand

        //em.getTransaction().commit();
        em.close();
        emf.close();
        System.out.println("============================================================");
        personList.forEach(System.out::println);
        System.out.println("============================================================");
    }
}
