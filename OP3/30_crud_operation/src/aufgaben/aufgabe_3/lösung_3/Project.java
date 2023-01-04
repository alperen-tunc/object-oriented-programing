/*
 * Copyright (c) 2023.
 * 4.1.2023
 * Salah Lejmi
 */

package aufgaben.aufgabe_3.lösung_3;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Project {

  private Long id;
  private String name;
  private LocalDate start;
  private List<Employee> employeeList = new ArrayList<>();
  
  public Project( Long id, String name, LocalDate start ) {
    this.id = id;
    this.name = name;
    this.start = start;
  }

  // Für einfache Konstruktion mit java.sql.Date
  public Project( Long id, String name, Date start ) {
    this(id, name, start == null ? null : start.toLocalDate());
  }
  
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public LocalDate getStart() {
    return start;
  }

  public void setStart(LocalDate start) {
    this.start = start;
  }
  
  public List<Employee> getEmployeeList() {
    return employeeList;
  }
  
  public void setEmployeeList( List<Employee> employeeList ) {
    this.employeeList = employeeList;
  }

  public void add( Employee employee ) {
    this.employeeList.add(employee);
  }
  
  
  @Override
  public String toString() {
    return String.format("(%d) - %s - Gestartet am: %s", id, name, start);
  }
  
  public void printInfo() {
    System.out.println(this); // this.toString()
    System.out.println("Mitarbeiter: " + ( employeeList.size() == 0 ? "Keine" : ""));
    employeeList.forEach(System.out::println);
    System.out.println("========================");
  }
  
  
}
