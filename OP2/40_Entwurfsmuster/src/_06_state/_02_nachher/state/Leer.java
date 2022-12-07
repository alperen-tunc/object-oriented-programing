package _06_state._02_nachher.state;

import _06_state._02_nachher.KaugummiAutomat;

public class Leer implements Zustand
{
    private KaugummiAutomat kaugummiAutomat;

    public Leer( KaugummiAutomat kaugummiAutomat ) {
        this.kaugummiAutomat = kaugummiAutomat;
    }

    public void münzeEinwerfen() {
        System.out.println("Sie können keine Münzen einwerfen, der Automat ist ausverkauft");
    }

    public void münzeAuswerfen() {
        System.out.println("Sie können nicht auswerfen, Sie haben noch keine Münze eingeworfen");
    }

    public void hebelDrehen() {
        System.out.println("Sie haben gedreht, aber es gibt keine Kaugummis");
    }

    public void ausgeben() {
        System.out.println("No gumball dispensed");
    }

    public void nachfüllen( ) {
        kaugummiAutomat.setState(kaugummiAutomat.getKeineMünzeState());
    }

    public String toString() {
        return "ausverkauft/leer";
    }
}
