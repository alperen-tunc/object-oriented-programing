package aufgaben.aufgabe_2;


import java.sql.Date;

public class PersonalAusweis {

  private long id;
  private String nummer;
  private java.sql.Date ausgestellt;
  private java.sql.Date gültig;
  private long personId;

  public PersonalAusweis(String nummer, Date gültig)
  {
    this.nummer = nummer;
    this.gültig = gültig;
  }

  public PersonalAusweis()
  {}

  public PersonalAusweis(long id, String nummer, Date ausgestellt, Date gültig, long personId)
  {
    this.id = id;
    this.nummer = nummer;
    this.ausgestellt = ausgestellt;
    this.gültig = gültig;
    this.personId = personId;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getNummer() {
    return nummer;
  }

  public void setNummer(String nummer) {
    this.nummer = nummer;
  }


  public java.sql.Date getAusgestellt() {
    return ausgestellt;
  }

  public void setAusgestellt(java.sql.Date ausgestellt) {
    this.ausgestellt = ausgestellt;
  }


  public java.sql.Date getGültig() {
    return gültig;
  }

  public void setGültig(java.sql.Date gültig) {
    this.gültig = gültig;
  }

  public long getPersonId() {
    return personId;
  }

  public void setPersonId(long personId) {
    this.personId = personId;
  }

  @Override
  public String toString()
  {
    return "PersonalAusweis{" +
            "id=" + id +
            ", nummer='" + nummer + '\'' +
            ", ausgestellt=" + ausgestellt +
            ", gültig=" + gültig +
            ", personId=" + personId +
            '}';
  }
}
