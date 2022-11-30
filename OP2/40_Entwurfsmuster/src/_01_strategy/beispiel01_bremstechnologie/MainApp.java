package op2.t04_entwurfsmuster.t01_strategy.beispiel01_bremstechnologie;

public class MainApp {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    Auto meinAuto = new Auto( new BremseMitABS() );
    meinAuto.bremsvorgangEinleiten();
    System.out.println("============================================================");
    meinAuto.setBremsTechnologie( new BremseMitDTH() );
    meinAuto.bremsvorgangEinleiten();
    System.out.println("======================= end of main() ======================");
  }
  
}
