package _02_one2many;


import java.util.ArrayList;
import java.util.List;

public class Person {

  private long id;
  private String vorname;
  private String nachname;
  private List<Kfz> kfzList = new ArrayList<>();

  public Person(long id, String vorname, String nachname)
  {
    this.id = id;
    this.vorname = vorname;
    this.nachname = nachname;
  }

  public Person()
  {

  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getVorname() {
    return vorname;
  }

  public void setVorname(String vorname) {
    this.vorname = vorname;
  }


  public String getNachname() {
    return nachname;
  }

  public void setNachname(String nachname) {
    this.nachname = nachname;
  }

  public List<Kfz> getKfzList()
  {
    return kfzList;
  }

  public void setKfzList(List<Kfz> kfzList)
  {
    this.kfzList = kfzList;
  }

  public void add(Kfz kfz)
  {
    kfzList.add(kfz);
  }

  public void  printInfo()
  {
    System.out.println(this);
    System.out.println("- Fahrzeuge: " + (kfzList.size() == 0 ? "Keine":""));
    kfzList.forEach(System.out::println);
  }

  @Override
  public String toString()
  {
    return "Person{" +
            "id=" + id +
            ", vorname='" + vorname + '\'' +
            ", nachname='" + nachname + '\'' +
            '}';
  }

}
