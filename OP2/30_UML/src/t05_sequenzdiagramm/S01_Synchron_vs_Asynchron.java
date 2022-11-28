package t05_sequenzdiagramm;

public class S01_Synchron_vs_Asynchron {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    

    System.out.println("printZahlen() wird ausgeführt ...");
    //printZahlen(); // Synchron oder Sequentiell

    // Asynchron oder Parallel => Hintergrundausführung
    Thread th = new Thread(() -> printZahlen());
    th.start();
  
    System.out.println("Nach Aufruf von printZahlen()");
    
    System.out.println("======================= end of main() ======================");
  }
  
  private static void printZahlen() {
    for( int i = 1 ; i <= 10 ; i++ ) {
      System.out.println(i);
      sleep(1);
    }
  }
  
  private static void sleep( int sec ) {
    try {
      Thread.sleep(sec * 1000);
    } catch ( InterruptedException e ) {
      throw new RuntimeException(e);
    }
  }
  
}
