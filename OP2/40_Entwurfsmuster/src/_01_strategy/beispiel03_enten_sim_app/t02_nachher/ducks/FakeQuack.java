package _01_strategy.beispiel03_enten_sim_app.t02_nachher.ducks;

import _01_strategy.beispiel03_enten_sim_app.t02_nachher.quack.QuackBehavior;

public class FakeQuack implements QuackBehavior
{
  
  public void quack() {
    System.out.println("Qwak");
  }
  
}
