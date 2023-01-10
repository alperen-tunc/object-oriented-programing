package _01_Entity;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class JPA_Test
{
    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");// siehe persistence.xml
        EntityManager em = emf.createEntityManager();
        TypedQuery<Person> query = em.createQuery("SELECT p FROM Person p order by id desc ", Person.class);
        List<Person> personList = query.getResultList();
        em.close();
        emf.close();
        // =============================================================================
        personList.forEach(System.out::println);
    }
}
