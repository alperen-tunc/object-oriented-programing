package _01_strategy.beispiel03_enten_sim_app.t02_nachher.ducks;


import _01_strategy.beispiel03_enten_sim_app.t02_nachher.fly.FlyNoWay;
import _01_strategy.beispiel03_enten_sim_app.t02_nachher.quack.MuteQuack;

public class DecoyDuck extends Duck {
  
  public DecoyDuck() {
    setFlyBehavior(new FlyNoWay());
    setQuackBehavior(new MuteQuack());
  }
  
  public void display() {
    System.out.println("I'm a duck Decoy");
  }
  
}
