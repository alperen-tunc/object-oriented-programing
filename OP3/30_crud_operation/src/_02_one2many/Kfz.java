package _02_one2many;


public class Kfz {

  private long id;
  private String hersteller;
  private String modell;
  private Person besitzer;

  public Kfz()
  {

  }
  public Kfz(long id, String hersteller, String modell)
  {
    this.id = id;
    this.hersteller = hersteller;
    this.modell = modell;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getHersteller() {
    return hersteller;
  }

  public void setHersteller(String hersteller) {
    this.hersteller = hersteller;
  }


  public String getModell() {
    return modell;
  }

  public void setModell(String modell) {
    this.modell = modell;
  }

  @Override
  public String toString()
  {
    return "   Kfz{" +
            "id=" + id +
            ", hersteller='" + hersteller + '\'' +
            ", modell='" + modell + '\'' +
            '}';
  }
}
