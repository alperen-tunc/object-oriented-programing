/*
 * Copyright (c) 2023.
 * 4.1.2023
 * Salah Lejmi
 */

package aufgaben.aufgabe_3.lösung_3;


import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static vorlesung.DatabaseConfig.*;

public class Many2Many {
  
  public static void main( String[] args ) throws Exception {
    readEmployeesWithAssignedProjects();
    readProjectsWithAssignedEmployees();
  }
  
  private static void readEmployeesWithAssignedProjects() throws Exception {
    System.out.println("\n");
    System.out.println("===================================================");
    System.out.println("=        Employee <= Many2Many => Project         =");
    System.out.println("===================================================");
    Connection con = DriverManager.getConnection(DB_URL4, DB_USERNAME, DB_PASSWORD);
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEE_PROJECT_VIEW"); // View
    List<Employee> employeeList = new ArrayList<>();
    Employee employee = new Employee(-1L, null, null);
    while ( rs.next() ) {
      Long employeeId = rs.getLong("EMPLOYEE_ID");
      String vorname = rs.getString("VORNAME");
      String nachname = rs.getString("NACHNAME");
      //System.out.format("(%d) - %s %s%n", employeeId, vorname, nachname);
      // Wenn gleiche ID wie vorheriger Datensatz dann keine neues Employee-Objekt erstellen.
      if (! employeeId.equals(employee.getId())) {
        employee = new Employee(employeeId, vorname, nachname);
        employeeList.add(employee);
      }
      // ==============================================================
      Long projectId = rs.getLong("PROJECT_ID");
      if (projectId == 0)
        continue;
      String name = rs.getString("NAME");
      Date startDate = rs.getDate("START");
      //System.out.format("(%d) - %s - %s%n", projectId, name, startDate);
      Project project = new Project(projectId, name, startDate);
      employee.add(project);
    }
    con.close();
    employeeList.forEach(Employee::printInfo);
  }
  
  private static void readProjectsWithAssignedEmployees() throws Exception {
    System.out.println("\n");
    System.out.println("===================================================");
    System.out.println("=        Project  <= Many2Many =>  Employee       =");
    System.out.println("===================================================");
    Connection con = DriverManager.getConnection(DB_URL4, DB_USERNAME, DB_PASSWORD);
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM PROJECT_EMPLOYEE_VIEW"); // View
    List<Project> projectList = new ArrayList<>();
    Project project = new Project(-1L, (String) null, (LocalDate) null);
    while ( rs.next() ) {
      Long projectId = rs.getLong("PROJECT_ID");
      String name = rs.getString("NAME");
      Date startDate = rs.getDate("START");
      //System.out.format("(%d) - %s %s%n", projectId, name, startDate);
      // Wenn gleiche ID wie vorheriger Datensatz dann kein neues Project-Objekt erstellen.
      if (!projectId.equals(project.getId())) {
        project = new Project(projectId, name, startDate);
        projectList.add(project);
      }
      // ==============================================================
      Long employeeId = rs.getLong("EMPLOYEE_ID");
      if (employeeId == 0)
        continue;
      String vorname = rs.getString("VORNAME");
      String nachname = rs.getString("NACHNAME");
      //System.out.format("(%d) - %s %s%n", employeeId, vorname, nachname);
      Employee employee = new Employee(employeeId, vorname, nachname);
      project.add(employee);
    }
    con.close();
    projectList.forEach(Project::printInfo);

  }
  
}
