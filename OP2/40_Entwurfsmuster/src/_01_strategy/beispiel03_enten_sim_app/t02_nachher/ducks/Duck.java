package op2.t04_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher.ducks;

import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher.fly.FlyBehavior;
import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher.quack.QuackBehavior;

public abstract class Duck {
  
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;
  
  public Duck() {
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
