package _02_crud_operationen;

import _01_Entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class _04_Delete
{
    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");// siehe persistence.xml
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        // =============================================================================
        Person person = new Person(2L, "dummy","dummy"); // person ist im NICHT im "managed"-Zustand

        Person managedPerson = em.merge(person);
        em.remove(managedPerson);

        //em.remove(em.merge(person));  // Alternative
        // =============================================================================

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
