package _02_crud_operationen;

import _01_Entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class _03_Update
{
    public static void main(String[] args)
    {
        Person person = new Person(5L,"Alperen", "Tunc");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");// siehe persistence.xml
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Person managedPerson = em.merge(person);
        // managedPerson ist eine Kopie von person, im "managed"-Zustand

        em.getTransaction().commit();
        em.close();
        emf.close();
        System.out.println("============================================================");
        System.out.println("Person [" + person + "] wurde aktualisiert");
    }
}
