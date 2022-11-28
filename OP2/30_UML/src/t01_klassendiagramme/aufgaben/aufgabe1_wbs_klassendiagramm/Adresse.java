package op2.t03_UML.t01_klassendiagramme.aufgaben.aufgabe1_wbs_klassendiagramm;

public class Adresse {
  private int id;
  private String strasse;
  private String hausnummer;
  private int plz;
  private String ort;
  
  @Override
  public boolean equals( Object o ) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    
    Adresse adresse = (Adresse) o;
  
    return id == adresse.id;
  }
  
  @Override
  public int hashCode() {
    return id;
  }
  
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Adresse{");
    sb.append("id=").append(id);
    sb.append(", strasse='").append(strasse).append('\'');
    sb.append(", hausnummer='").append(hausnummer).append('\'');
    sb.append(", plz=").append(plz);
    sb.append(", ort='").append(ort).append('\'');
    sb.append('}');
    return sb.toString();
  }
  
}
