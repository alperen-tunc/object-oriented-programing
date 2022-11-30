package op2.t04_entwurfsmuster.t01_strategy.beispiel03_enten_sim_app.t02_nachher.quack;

public class MuteQuack implements QuackBehavior {
  
  public void quack() {
    System.out.println("<< Silence >>");
  }
  
}
