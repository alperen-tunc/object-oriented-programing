package _06_state._02_nachher.state;

import _06_state._02_nachher.KaugummiAutomat;

public class HatMünze implements Zustand
{
    private KaugummiAutomat kaugummiAutomat;

    public HatMünze( KaugummiAutomat kaugummiAutomat ) {
        this.kaugummiAutomat = kaugummiAutomat;
    }

    public void münzeEinwerfen() {
        System.out.println("Sie können keine weitere Münze einwerfen"); // Fehlermeldung
        // => Keine Zustandsänderung
    }

    public void münzeAuswerfen() {
        System.out.println("Münze ausgeworfen");
        kaugummiAutomat.setState( kaugummiAutomat.getKeineMünzeState() );
    }

    public void hebelDrehen() {
        System.out.println("Sie haben den Hebel gedreht ...");
        kaugummiAutomat.setState( kaugummiAutomat.getVerkauftState() );
        //ausgeben(); // Wäre hier FALSCH, da Zustand sich geändert hat.
    }

    public void ausgeben() {
        System.out.println("Keine Kaugummi-Bälle ausgegeben");
    }

    public void nachfüllen( ) {
    }

    public String toString() {
        return "Warte auf Drehen des Hebels";
    }
}
