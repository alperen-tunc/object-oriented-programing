package _01_strategy.beispiel03_enten_sim_app.t02_nachher.ducks;

import _01_strategy.beispiel03_enten_sim_app.t02_nachher.fly.FlyBehavior;
import _01_strategy.beispiel03_enten_sim_app.t02_nachher.quack.QuackBehavior;

public abstract class Duck
{
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;
  public Duck()
  {
  }
  
  public void setFlyBehavior( FlyBehavior fb ) {
    flyBehavior = fb;
  }
  
  public void setQuackBehavior( QuackBehavior qb ) {
    quackBehavior = qb;
  }
  
  abstract void display();
  
  public void performFly() {
    flyBehavior.fly();
  }
  
  public void performQuack() {
    quackBehavior.quack();
  }
  
  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }
  
}
