package Tutorial.src._30_Design_Patterns._01_Singleton;

public class App
{
    public static void main(String[] args)
    {
        for (int i=0; i<10;i++)
        {
            Singleton singleton = Singleton.getSingleton();
        }

        Singleton singleton1 = Singleton.getSingleton();
    }
}
