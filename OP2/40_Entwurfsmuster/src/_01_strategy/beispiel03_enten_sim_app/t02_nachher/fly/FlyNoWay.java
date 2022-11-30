package op2.t04_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher.fly;

public class FlyNoWay implements FlyBehavior {
  
  public void fly() {
    System.out.println("I can't fliegen");
  }
  
}
