package Tutorial._30_Design_Patterns._08_proxy;

import java.math.BigDecimal;

public class App
{
    public static void main(String[] args)
    {
        ProxyLeiter proxyLeiter = new ProxyLeiter("Mesmin", "12345");

        try
        {
            BigDecimal umsatz = proxyLeiter.getUmsatz();
            System.out.println("Umsatz: " + umsatz);
        } catch (IllegalAccessException e)
        {
            System.out.println("Sie haben kein Zugriffsrecht, um FirmenUmsatz zu sehen.");
        }



        System.out.println("\n\nEnd of Main..");
    }
}
