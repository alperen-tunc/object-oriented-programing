package op2.t03_UML.t01_klassendiagramme.aufgaben.aufgabe1_wbs_klassendiagramm;

public class Person {
  private int id;
  private String vorname;
  private String nachname;
  private Adresse adresse;
  
  @Override
  public boolean equals( Object o ) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return id == person.id;
  }
  
  @Override
  public int hashCode() {
    return id;
  }
  
  @Override
  public String toString() {
    return vorname + " " + nachname;
  }
  
  public void printData() {
    System.out.format("(%d) - %s %s%n", id, vorname, nachname);
  }
  
}
