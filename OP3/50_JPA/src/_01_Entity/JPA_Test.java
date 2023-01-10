package _01_Entity;


import jakarta.persistence.*;

import java.util.List;

public class JPA_Test
{
    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");// siehe persistence.xml
        EntityManager em = emf.createEntityManager();
        TypedQuery<Person> query = em.createQuery("SELECT p FROM Person p order by id ", Person.class);
        List<Person> personList = query.getResultList();
        em.close();
        emf.close();
        // =============================================================================
        personList.forEach(System.out::println);
    }
}
