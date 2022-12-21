package Tutorial._30_Design_Patterns._08_proxy;

import java.math.BigDecimal;

public class WahreLeiter implements FirmaInfo
{

    @Override
    public BigDecimal getUmsatz() throws IllegalAccessException
    {
        return BigDecimal.valueOf(10000);
    }
}
