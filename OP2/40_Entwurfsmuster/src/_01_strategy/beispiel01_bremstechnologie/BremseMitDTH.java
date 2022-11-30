package op2.t04_entwurfsmuster.t01_strategy.beispiel01_bremstechnologie;

public class BremseMitDTH implements BremsTechnologie {
  
  @Override
  public void bremsen() {
    System.out.println("Bremsen mit DTH");
  }
  
}
