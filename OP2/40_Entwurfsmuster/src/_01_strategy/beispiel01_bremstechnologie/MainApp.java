package _01_strategy.beispiel01_bremstechnologie;

public class MainApp {
  
  public static void main( String[] args ) {

    System.out.println("");
    Auto meinAuto = new Auto( new BremseMitABS() );

    meinAuto.bremsvorgangEinleiten();

    System.out.println("");

    meinAuto.setBremsTechnologie( new BremseMitDTH() );

    meinAuto.bremsvorgangEinleiten();
    System.out.println();

    Auto tesla = new Auto();
    BremsTechnologie fürTesla = new BremsTechnologie()
    {
      @Override
      public void bremsen()
      {
        System.out.println("Ich wurde für tesla entwickelt");
      }
    };

    tesla.setBremsTechnologie(fürTesla);
    tesla.bremsvorgangEinleiten();

    System.out.println("\n======================= end of main() ======================");
  }
  
}
