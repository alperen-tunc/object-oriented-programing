/*
 * Copyright (c) 2023.
 * 4.1.2023
 * Salah Lejmi
 */

package aufgaben.aufgabe_2.lösung_2;

import java.util.Objects;

public class Person {
  private Long id;
  private String vorname;
  private String nachname;
  private PersonalAusweis pa;
  
  public Person() {
  }
  
  public Person( String vorname, String nachname ) {
    this.vorname = vorname;
    this.nachname = nachname;
  }
  
  public Person( Long id, String vorname, String nachname ) {
    this.id = id;
    this.vorname = vorname;
    this.nachname = nachname;
  }
  
  public Long getId() {
    return id;
  }
  
  public Person setId( Long id ) {
    this.id = id;
    return this;
  }
  
  public String getVorname() {
    return vorname;
  }
  
  public Person setVorname( String vorname ) {
    this.vorname = vorname;
    return this;
  }
  
  public String getNachname() {
    return nachname;
  }
  
  public Person setNachname( String nachname ) {
    this.nachname = nachname;
    return this;
  }
  
  public PersonalAusweis getPersonalAusweis() {
    return pa;
  }
  
  public Person setPersonalAusweis( PersonalAusweis pa ) {
    this.pa = pa;
    return this;
  }
  
  @Override
  public boolean equals( Object o ) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    
    Person person = (Person) o;
  
    return Objects.equals(id, person.id);
  }
  
  @Override
  public int hashCode() {
    return id != null ? id.hashCode() : 0;
  }
  
  //@Override
  //public String toString() {
  //  final StringBuilder sb = new StringBuilder("Person{");
  //  sb.append("id=")
  //    .append(id);
  //  sb.append(", vorname='")
  //    .append(vorname)
  //    .append('\'');
  //  sb.append(", nachname='")
  //    .append(nachname)
  //    .append('\'');
  //  sb.append('}');
  //  return sb.toString();
  //}
  
  @Override
  public String toString() {
    return String.format("(%d) - %s %s", id, vorname, nachname);
  }
  
  public void printInfo() {
    System.out.println(this); // this.toString()
    System.out.println("Personalausweis: " + pa);
    System.out.println("========================");
  }
  
}
