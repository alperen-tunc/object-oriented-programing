package Vorlesung;


public interface Startable1
{
    void start();
    void stop();

    default void defaultMethode(){}
    static void staticMethode(){}
}
