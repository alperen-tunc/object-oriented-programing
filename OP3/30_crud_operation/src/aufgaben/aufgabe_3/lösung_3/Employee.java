/*
 * Copyright (c) 2023.
 * 4.1.2023
 * Salah Lejmi
 */

package aufgaben.aufgabe_3.lösung_3;

import java.util.ArrayList;
import java.util.List;

public class Employee {

  private Long id;
  private String vorname;
  private String nachname;
  private List<Project> projectList = new ArrayList<>();
  
  public Employee( Long id, String vorname, String nachname ) {
    this.id = id;
    this.vorname = vorname;
    this.nachname = nachname;
  }
  
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
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
  
  public List<Project> getProjectList() {
    return projectList;
  }
  
  public void setProjectList( List<Project> projectList ) {
    this.projectList = projectList;
  }
  
  public void add( Project project ) {
    projectList.add(project);
  }
  
  @Override
  public String toString() {
    return String.format("(%d) - %s %s", id, vorname, nachname);
  }
  
  public void printInfo() {
    System.out.println(this); // this.toString()
    System.out.println("Projekte: " + ( projectList.size() == 0 ? "Keine" : ""));
    projectList.forEach(System.out::println);
    System.out.println("========================");
  }
  
}
