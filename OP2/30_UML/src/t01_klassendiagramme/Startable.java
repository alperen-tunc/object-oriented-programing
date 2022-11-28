package t01_klassendiagramme;

public /*abstract*/ interface Startable {
  // Statische Konstanten
  
  /*public abstract*/ void start();
  /*public abstract*/ void stop();
  
  /*public*/ default void defaultMethod() { }
  
  /*public*/ static  void staticMethod() { }
  
  // Innere Typdeklarationen
}
