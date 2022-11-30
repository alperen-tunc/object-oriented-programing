package op2.t04_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher.ducks;


import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher.fly.FlyNoWay;
import op2.op2_35_bis_50_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher.quack.MuteQuack;

public class DecoyDuck extends Duck {
  
  public DecoyDuck() {
    setFlyBehavior(new FlyNoWay());
    setQuackBehavior(new MuteQuack());
  }
  
  public void display() {
    System.out.println("I'm a duck Decoy");
  }
  
}
