package _03_relationships;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaStarter {

    private static EntityManagerFactory emf;
    public static EntityManager em;

    public static void init( String unitName) {
        emf = Persistence.createEntityManagerFactory(unitName);
    }

    public static void stop() {
        emf.close();
    }

    public static void launch( Runnable runnable ) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        System.out.println("============================================================");
        runnable.run();
        System.out.println("============================================================");
        em.getTransaction().commit();
        em.close();
    }





}
