package op2.t04_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher.ducks;

import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher.fly.FlyWithWings;
import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher.quack.Quack;

public class RedHeadDuck extends Duck {
  
  public RedHeadDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }
  
  public void display() {
    System.out.println("I'm a real Red Headed duck");
  }
  
}
