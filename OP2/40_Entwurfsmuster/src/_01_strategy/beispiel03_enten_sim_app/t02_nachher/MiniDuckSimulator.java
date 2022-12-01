package _01_strategy.beispiel03_enten_sim_app.t02_nachher;

import _01_strategy.beispiel03_enten_sim_app.t02_nachher.ducks.*;
import _01_strategy.beispiel03_enten_sim_app.t02_nachher.fly.FlyRocketPowered;


public class MiniDuckSimulator
{
  public static void main( String[] args )
  {
    System.out.println("============================================================");
    Duck mallard      = new MallardDuck();
    Duck rubber       = new RubberDuck();
    Duck decoy        = new DecoyDuck();
    // =============================================================================
    mallard.performQuack();
    rubber.performQuack();
    decoy.performQuack();
    System.out.println("============================================================");
    Duck model        = new ModelDuck();
    // =============================================================================
    model.performFly();
    model.setFlyBehavior( new FlyRocketPowered() ); // Flugverhalten in der Laufzeit ändern
    model.performFly();
    System.out.println("======================= end of main() ======================");
  }
  
}
