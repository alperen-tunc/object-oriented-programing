/*
 * Copyright (c) 2023.
 * 4.1.2023
 * Salah Lejmi
 */

package aufgaben.aufgabe_2.lösung_2;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

public class PersonalAusweis {
  private Long id;
  private String nummer;
  private LocalDate ausgestellt;
  private LocalDate gültig;
  //private Long personId; // Keine Referenzvariable => Unidirektionale Beziehung
  
  public PersonalAusweis() {
  }
  
  public PersonalAusweis( Long id, String nummer,
                          LocalDate ausgestellt, LocalDate gültig ) {
    this.id = id;
    this.nummer = nummer;
    this.ausgestellt = ausgestellt;
    this.gültig = gültig;
  }
  
  public PersonalAusweis( Long id, String nummer, Date ausgestellt, Date gültig ) {
    this(id, nummer, ausgestellt == null ? null:ausgestellt.toLocalDate(),
                     gültig == null ? null: gültig.toLocalDate());
  }
  
  public Long getId() {
    return id;
  }
  
  public PersonalAusweis setId( Long id ) {
    this.id = id;
    return this;
  }
  
  public String getNummer() {
    return nummer;
  }
  
  public PersonalAusweis setNummer( String nummer ) {
    this.nummer = nummer;
    return this;
  }
  
  public LocalDate getAusgestellt() {
    return ausgestellt;
  }
  
  public PersonalAusweis setAusgestellt( LocalDate ausgestellt ) {
    this.ausgestellt = ausgestellt;
    return this;
  }
  
  public LocalDate getGültig() {
    return gültig;
  }
  
  public PersonalAusweis setGültig( LocalDate gültig ) {
    this.gültig = gültig;
    return this;
  }
  
  @Override
  public boolean equals( Object o ) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    
    PersonalAusweis that = (PersonalAusweis) o;
  
    return Objects.equals(id, that.id);
  }
  
  @Override
  public int hashCode() {
    return id != null ? id.hashCode() : 0;
  }
  
  //@Override
  //public String toString() {
  //  final StringBuilder sb = new StringBuilder("PersonalAusweis{");
  //  sb.append("id=")
  //    .append(id);
  //  sb.append(", nummer='")
  //    .append(nummer)
  //    .append('\'');
  //  sb.append(", ausgestellt=")
  //    .append(ausgestellt);
  //  sb.append(", gültig=")
  //    .append(gültig);
  //  sb.append('}');
  //  return sb.toString();
  //}
  
  @Override
  public String toString() {
    return String.format("(%d) - %s - Ausgestellt am: %s - Gültig bis: %s",
                         id, nummer, ausgestellt, gültig);
  }
}
