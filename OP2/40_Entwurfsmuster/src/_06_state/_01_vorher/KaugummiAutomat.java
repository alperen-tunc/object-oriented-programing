package _06_state._01_vorher;

public class KaugummiAutomat
{
    final static int LEER = 0;
    final static int KEINE_MÜNZE =1;
    final static int HAT_MÜNZE = 2;
    final static int VERKAUFT = 3;
    final static int NEU_ZUSTAND =4;

    int zustand = LEER;
    int anzahl = 0;

    public KaugummiAutomat(int anzahl)
    {
        this.anzahl = anzahl;
        if (anzahl > 0)
        {
            zustand = KEINE_MÜNZE;
        }
    }

    public void münzeEinwerfen()
    {
        if (zustand == HAT_MÜNZE)
        {
            System.out.println("you can´t insert another quarter.");
        }
        else if (zustand == KEINE_MÜNZE)
        {
            zustand = HAT_MÜNZE;
            System.out.println("You inserted a quarter.");
        }
        else if (zustand == LEER)
        {
            System.out.println("You can´t insert a quarter, the machine ist sold out.");
        }
        else if (zustand == VERKAUFT)
        {
            System.out.println("Please wait, we´re already giving you a gumball");
        }
    }


    public void münzeAuswerfen()
    { // durch Drücken auf Stift
        if (zustand == HAT_MÜNZE)
        {  // OK
            System.out.println("Quarter returned");
            zustand = KEINE_MÜNZE;
        }
        else if (zustand == KEINE_MÜNZE)
        {
            System.out.println("You haven't inserted a quarter");
        }
        else if (zustand == VERKAUFT)
        {
            System.out.println("Sorry, you already turned the crank");
        }
        else if (zustand == LEER)
        {
            System.out.println("You can't eject, you haven't inserted a quarter yet");
        }
    }

    public void hebelDrehen()
    {
        if (zustand == VERKAUFT)
        {
            System.out.println("Turning twice doesn't get you another gumball!");
        }
        else if (zustand == KEINE_MÜNZE)
        {
            System.out.println("You turned but there's no quarter");
        }
        else if (zustand == LEER)
        {
            System.out.println("You turned, but there are no gumballs");
        }
        else if (zustand == HAT_MÜNZE)
        {
            System.out.println("You turned...");
            zustand = VERKAUFT;
            ausgeben();
        }
    }

    private void ausgeben() {
        if (zustand == VERKAUFT)
        {
            System.out.println("A gumball comes rolling out the slot");
            anzahl = anzahl - 1;
            if (anzahl == 0)
            {
                System.out.println("Oops, out of gumballs!");
                zustand = LEER;
            }
            else
            {
                zustand = KEINE_MÜNZE;
            }
        }
        else if (zustand == KEINE_MÜNZE)
        {
            System.out.println("You need to pay first");
        }
        else if (zustand == LEER)
        {
            System.out.println("No gumball dispensed");
        }
        else if (zustand == HAT_MÜNZE)
        {
            System.out.println("No gumball dispensed");
        }
    }

    public void nachfüllen( int neueKugeln )
    {
        this.anzahl = anzahl + neueKugeln;
    }

    public String toString()
    {
        StringBuffer result = new StringBuffer();
        result.append("Mighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: " + anzahl + " gumball");
        if (anzahl != 1)
        {
            result.append("s");
        }
        result.append("\nMachine is ");
        if (zustand == LEER)
        {
            result.append("sold out");
        }
        else if (zustand == KEINE_MÜNZE)
        {
            result.append("waiting for quarter");
        }
        else if (zustand == HAT_MÜNZE)
        {
            result.append("waiting for turn of crank");
        }
        else if (zustand == VERKAUFT)
        {
            result.append("delivering a gumball");
        }
        result.append("\n");
        return result.toString();
    }

}
