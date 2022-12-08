package _07_Proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyWebServer implements WebServer
{
    private RealWebServer realWebServer = new RealWebServer();
    private List<String> blackList = new ArrayList<>();

    @Override
    public void makeRequest( String url ) {
        if (blackList.contains(url)) { // Blockierte Seite
            System.out.println("Die angegebene URL: " + url + " ist blockiert !!!");
            return;
        }

        System.out.println(">>>>> Aktionen vor dem Download <<<<<");
        realWebServer.makeRequest(url);
        System.out.println(">>>>> Aktionen nach dem Download <<<<<");
    }

    public void blockWebsite( String url ) {
        blackList.add(url);
    }
}
