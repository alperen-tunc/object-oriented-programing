package t01_klassendiagramme;

public class Waschmaschine implements Startable {
  
  @Override
  public void start() {
    System.out.println("Waschmaschine wird gestartet ...");
  }
  
  @Override
  public void stop() {
    System.out.println("Waschmaschine wird gestoppt ...");
  }
  
}
