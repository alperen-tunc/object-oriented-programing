package _01_strategy.beispiel01_bremstechnologie;

public class MainApp {
  
  public static void main( String[] args ) {
    System.out.println("\n");
    Auto meinAuto = new Auto( new BremseMitABS() );
    meinAuto.bremsvorgangEinleiten();
    System.out.println("\n");
    meinAuto.setBremsTechnologie( new BremseMitDTH() );
    meinAuto.bremsvorgangEinleiten();
    System.out.println("\n======================= end of main() ======================");
  }
  
}
