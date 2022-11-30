package op2.t04_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher;

import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher.ducks.DecoyDuck;
import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher.ducks.Duck;
import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher.ducks.MallardDuck;
import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher.ducks.ModelDuck;
import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher.ducks.RubberDuck;
import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher.fly.FlyRocketPowered;

public class MiniDuckSimulator {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    Duck mallard      = new MallardDuck();
    Duck rubber = new RubberDuck();
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
