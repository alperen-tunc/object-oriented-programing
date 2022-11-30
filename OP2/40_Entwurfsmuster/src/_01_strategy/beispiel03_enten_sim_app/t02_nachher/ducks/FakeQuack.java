package op2.t04_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher.ducks;

import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher.quack.QuackBehavior;

public class FakeQuack implements QuackBehavior {
  
  public void quack() {
    System.out.println("Qwak");
  }
  
}
