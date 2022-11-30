package _01_strategy.beispiel03_enten_sim_app.t02_nachher.quack;

public class MuteQuack implements QuackBehavior {
  
  public void quack() {
    System.out.println("<< Silence >>");
  }
  
}
