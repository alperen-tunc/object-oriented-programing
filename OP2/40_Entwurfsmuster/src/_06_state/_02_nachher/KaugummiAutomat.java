package _06_state._02_nachher;

import _06_state._02_nachher.state.*;

public class KaugummiAutomat
{
    private Zustand leer;
    private Zustand keineMünze;
    private Zustand hatMünze;
    private Zustand verkauft;
    //private Zustand neuerZustand;

    private Zustand zustand;
    private int anzahl = 0;

    public KaugummiAutomat( int anzahl ) {
        leer       = new Leer(this);
        keineMünze = new KeineMünze(this);
        hatMünze   = new HatMünze(this);
        verkauft   = new Verkauft(this);

        this.anzahl = anzahl;
        if (anzahl > 0) {
            zustand = keineMünze;
        } else {
            zustand = leer;
        }
    }

    public void münzeEinwerfen() {
        zustand.münzeEinwerfen();
    }

    public void münzeAuswerfen() {
        zustand.münzeAuswerfen();
    }

    public void hebelDrehen() {
        zustand.hebelDrehen(); // Zustand wird auf "Verkauft" geändert
        zustand.ausgeben();    // Zustand auf "KeineMünze" oder "Leer" geändert
    }

    public void kaugummiHerauswerfen() {
        System.out.println("Ein Kaugummi kommt aus dem Schlitz gerollt ...");
        if (anzahl > 0) {
            anzahl = anzahl - 1;
        }
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void nachfüllen( int menge ) {
        this.anzahl += menge;
        System.out.println("The gumball machine was just refilled; its new menge is: " + this.anzahl);
        zustand.nachfüllen();
    }

    public Zustand getState() {
        return zustand;
    }

    public void setState( Zustand zustand ) {
        this.zustand = zustand;
    }

    public Zustand getLeerState() {
        return leer;
    }

    public Zustand getKeineMünzeState() {
        return keineMünze;
    }

    public Zustand getHatMünzeState() {
        return hatMünze;
    }

    public Zustand getVerkauftState() {
        return verkauft;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("Mighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + anzahl + " gumball");
        if (anzahl != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + zustand + "\n");
        return result.toString();
    }
}
