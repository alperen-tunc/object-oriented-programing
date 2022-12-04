package Tutorial.src._30_Design_Patterns._01_Singleton;

public class Singleton
{
    private static Singleton singleton;
    private static int zahl=0;

    public static Singleton getSingleton()
    {
        if (singleton == null)
        {
            synchronized (Singleton.class)
            {
                singleton = new Singleton();
            }
        }
        zahl++;
        System.out.println(zahl);
        return singleton;
    }

    private Singleton()
    {
        System.out.println("ich bin hier");
    }


}
