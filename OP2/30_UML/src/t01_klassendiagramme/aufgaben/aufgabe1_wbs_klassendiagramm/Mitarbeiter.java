package op2.t03_UML.t01_klassendiagramme.aufgaben.aufgabe1_wbs_klassendiagramm;

public class Mitarbeiter extends Person {
  private int maNr;  // Mitarbeiter-Nummer
  private int svr;   // Sozialversicherungsnummer
  private int honorar;   // Sozialversicherungsnummer
  
  @Override
  public void printData() {
    super.printData(); // Person::printData()
    System.out.println("Mitarbeiternummer: " + maNr);
    System.out.println("Sozialversicherungnummer: " + svr);
    System.out.println("Honorar: " + honorar);
  }
  
}
