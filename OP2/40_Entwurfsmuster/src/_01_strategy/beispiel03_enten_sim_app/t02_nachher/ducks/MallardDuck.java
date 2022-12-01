package _01_strategy.beispiel03_enten_sim_app.t02_nachher.ducks;

import _01_strategy.beispiel03_enten_sim_app.t02_nachher.fly.FlyWithWings;
import _01_strategy.beispiel03_enten_sim_app.t02_nachher.quack.Quack;

public class MallardDuck extends Duck
{
  public MallardDuck()
  {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }
  
  public void display() {
    System.out.println("I'm a real Mallard duck");
  }
  
}
