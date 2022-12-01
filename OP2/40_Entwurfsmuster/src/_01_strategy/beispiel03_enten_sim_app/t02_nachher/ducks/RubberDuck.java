package _01_strategy.beispiel03_enten_sim_app.t02_nachher.ducks;


import _01_strategy.beispiel03_enten_sim_app.t02_nachher.fly.FlyNoWay;
import _01_strategy.beispiel03_enten_sim_app.t02_nachher.quack.Squeak;

public class RubberDuck extends Duck
{
  
  public RubberDuck()
  {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Squeak();
  }
  
  public void display() {
    System.out.println("I'm a rubber duckie");
  }
  
}
