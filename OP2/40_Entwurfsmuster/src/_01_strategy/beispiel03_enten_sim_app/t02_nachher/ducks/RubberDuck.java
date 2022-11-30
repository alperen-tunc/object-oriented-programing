package op2.t04_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher.ducks;

import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher.fly.FlyBehavior;
import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher.fly.FlyNoWay;
import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher.quack.QuackBehavior;
import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher.quack.Squeak;

public class RubberDuck extends Duck {
  
  public RubberDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Squeak();
  }
  
  public void display() {
    System.out.println("I'm a rubber duckie");
  }
  
}
