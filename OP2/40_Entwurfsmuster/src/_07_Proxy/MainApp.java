package _07_Proxy;

public class MainApp
{
    static final String URL1 = "http://www.lejmi.de";
    static final String URL2 = "http://www.heute.de";

    public static void main( String[] args ) {
        System.out.println("============================================================");
        //WebServer server = createRealServer();
        WebServer server = createProxyServer();
        server.makeRequest(URL1);
        server.makeRequest(URL2);

        System.out.println("======================= end of main() ======================");
    }

    public static WebServer createRealServer() {
        return new RealWebServer();
    }

    public static WebServer createProxyServer() {
        ProxyWebServer proxyServer = new ProxyWebServer();
        proxyServer.blockWebsite(URL1);
        return proxyServer;
    }
}
