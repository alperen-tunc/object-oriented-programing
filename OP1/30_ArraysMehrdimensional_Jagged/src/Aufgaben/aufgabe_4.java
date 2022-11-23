package Aufgaben;

/*
    Ein Ladenbesitzer hat in 3 Städten Filialen und er möchte für jeden Mitarbeiter das Gehalt abspeichern.

        In Stadt 0 gibt es 2 Läden
        In Stadt 1 gibt es 4 Läden
        In Stadt 2 gibt es 3 Läden

        In Stadt 0, Laden 0 arbeiten 5 Mitarbeiter
        In Stadt 0, Laden 1 arbeiten 2 Mitarbeiter

        In Stadt 1, Laden 0 arbeiten 3 Mitarbeiter
        In Stadt 1, Laden 1 arbeiten 2 Mitarbeiter
        In Stadt 1, Laden 2 arbeiten 1 Mitarbeiter
        In Stadt 1, Laden 3 arbeiten 4 Mitarbeiter

        In Stadt 2, Laden 0 arbeiten 2 Mitarbeiter
        In Stadt 2, Laden 1 arbeiten 2 Mitarbeiter
        In Stadt 2, Laden 2 arbeiten 3 Mitarbeiter

  Aufgabe:
  Schreiben Sie bitte ein Java-Programm, in dem ein entsprechendes jagged Array eingeführt wird.
  Füllen Sie bitte mittels verschachtelter Schleifen alle Felder mit dem Wert -1 (jedem Mitarbeiter wird -1 zugewiesen)
  Geben Sie bitte pro Füllvorgang an, welche Mitarbeiternummer, Ladennummer und Stadtnummer aktuell befüllt wird
*/

public class aufgabe_4 {

    public static void main(String[] args) {
        double[][][] gehalt = new double[3][][]; // 3 Städte
        gehalt[0] = new double[2][]; // In Stadt 0 gibt es 2 Läden
        gehalt[1] = new double[4][]; // In Stadt 1 gibt es 4 Läden
        gehalt[2] = new double[3][]; // In Stadt 2 gibt es 3 Läden

        gehalt[0][0] = new double[5]; // In Stadt 0, Laden 0 arbeiten 5 Mitarbeiter
        gehalt[0][1] = new double[2]; // In Stadt 0, Laden 1 arbeiten 2 Mitarbeiter

        gehalt[1][0] = new double[3]; // In Stadt 1, Laden 0 arbeiten 3 Mitarbeiter
        gehalt[1][1] = new double[2]; // In Stadt 1, Laden 1 arbeiten 2 Mitarbeiter
        gehalt[1][2] = new double[1]; // In Stadt 1, Laden 2 arbeiten 1 Mitarbeiter
        gehalt[1][3] = new double[4]; // In Stadt 1, Laden 3 arbeiten 4 Mitarbeiter

        gehalt[2][0] = new double[2]; // In Stadt 2, Laden 0 arbeiten 2 Mitarbeiter
        gehalt[2][1] = new double[2]; // In Stadt 2, Laden 1 arbeiten 2 Mitarbeiter
        gehalt[2][2] = new double[3]; // In Stadt 2, Laden 2 arbeiten 3 Mitarbeiter

        for (int i = 0; i < gehalt.length; i++)
        {
            System.out.println("Stadt " + i);
            for (int j = 0; j < gehalt[i].length; j++)
            {
                System.out.println("  Laden " + j);
                for (int k = 0; k < gehalt[i][j].length; k++)
                {
                    gehalt[i][j][k] = -1;
                    System.out.print("    Mitarbeiter " + k + " gehalt: " + gehalt[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println();

    }
}