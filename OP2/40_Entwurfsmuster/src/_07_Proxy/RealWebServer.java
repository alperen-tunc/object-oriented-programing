package _07_Proxy;

import java.util.ArrayList;
import java.util.List;

public class RealWebServer implements WebServer
{
    public void makeRequest(String url) {
        System.out.println("Inhalte von " + url + " werden heruntergeladen ...");
    }

}
