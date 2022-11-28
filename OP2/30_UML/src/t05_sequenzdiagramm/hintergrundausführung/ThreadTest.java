package t05_sequenzdiagramm.hintergrundausführung;

public class ThreadTest {
  
  public static void main( String[] args )  {
    System.out.println("============================================================");
    //doSomething();                           // Synchroner Aufruf (sequentiell)
    // =============================================================================
    //new Thread( () -> doSomething() ).start();   // Asynchroner Aufruf (parallel)
    new Thread( ThreadTest::doSomething ).start(); // Alternative mit Methodenreferenz
    System.out.println("======================= end of main() ======================");
  }
  
  private static void doSomething()  {
    for( int i = 1 ; i <= 10 ; i++ ) {
      System.out.println(i);
      sleep(3);
    }
  }
  
  private static void sleep( int sec )  {
    try {
      Thread.sleep(1000 * sec);
    } catch ( InterruptedException e ) {
      throw new RuntimeException(e);
    }
  }
  
}
