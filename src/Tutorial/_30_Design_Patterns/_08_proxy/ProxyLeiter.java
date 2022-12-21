package Tutorial._30_Design_Patterns._08_proxy;

import java.math.BigDecimal;

public class ProxyLeiter implements FirmaInfo
{
    private WahreLeiter wahreLeiter;
    private String userName;
    private String password;

    public ProxyLeiter(String userName, String password)
    {
        this.wahreLeiter = new WahreLeiter();
        this.userName = userName;
        this.password = password;
    }

    private boolean isUserLeiter()
    {
        boolean isUserLeiter = false;

        boolean isUserValid = MitarbeiterUtil.isUserValid(userName, password);

        if (isUserValid)
        {
            Mitarbeiter mitarbeiter = MitarbeiterUtil.getMitarbeiterByUserName(userName);
            isUserLeiter = mitarbeiter.isLeiter();
        }

        return isUserLeiter;
    }

    @Override
    public BigDecimal getUmsatz() throws IllegalAccessException
    {
        boolean isUserLeiter = isUserLeiter();

        if (isUserLeiter)
        {
            return wahreLeiter.getUmsatz();
        }
        else
        {
            throw new IllegalAccessException();
        }
    }
}
