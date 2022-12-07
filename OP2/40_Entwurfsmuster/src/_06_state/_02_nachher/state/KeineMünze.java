package _06_state._02_nachher.state;

import _06_state._02_nachher.KaugummiAutomat;

public class KeineMünze implements Zustand
{
    private KaugummiAutomat kaugummiAutomat;

    public KeineMünze( KaugummiAutomat kaugummiAutomat ) {
        this.kaugummiAutomat = kaugummiAutomat;
    }

    public void münzeEinwerfen() {
        System.out.println("Sie haben eine Münze eingeworfen");
        kaugummiAutomat.setState(kaugummiAutomat.getHatMünzeState());
    }

    public void münzeAuswerfen() { // Stift drücken
        System.out.println("Sie haben keine Münze eingeworfen"); // Fehlermeldung
    }

    public void hebelDrehen() {
        System.out.println("Hebel gedreht, aber es keine Münze eingeworfen"); // Fehlermeldung
    }

    public void ausgeben() {
        System.out.println("Sie müssen zuerst bezahlen"); // Fehlermeldung
    }

    public void nachfüllen( ) {
    }

    public String toString() {
        return "Warte auf Münzeneinwurf";
    }
}
