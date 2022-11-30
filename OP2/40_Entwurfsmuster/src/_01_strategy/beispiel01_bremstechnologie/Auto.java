package _01_strategy.beispiel01_bremstechnologie;

public class Auto /* implements BremsTechnologie */ {
  // Programmieren zum Supertypen
  private BremsTechnologie bremsTechnologie; // Komposition gegebüber Vererbung vorziehen
  
  public Auto() { }
  
  public Auto( BremsTechnologie bremsTechnologie ) {
    this.bremsTechnologie = bremsTechnologie;
  }
  
  public void setBremsTechnologie( BremsTechnologie bremsTechnologie ) {
    this.bremsTechnologie = bremsTechnologie;
  }
  
  public void bremsvorgangEinleiten() {
    bremsTechnologie.bremsen();
  }
  
}
