package _01_strategy.beispiel03_enten_sim_app.t02_nachher.ducks;

import _01_strategy.beispiel03_enten_sim_app.t02_nachher.fly.FlyNoWay;
import _01_strategy.beispiel03_enten_sim_app.t02_nachher.quack.Quack;

public class ModelDuck extends Duck {
  
  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }
  
  public void display() {
    System.out.println("I'm a model duck");
  }
  
}
