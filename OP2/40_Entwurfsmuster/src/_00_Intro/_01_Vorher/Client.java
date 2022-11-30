package _00_Intro._01_Vorher;

public class Client
{
    public static void main( String[] args ) {
        System.out.println("============================================================");
        clientMethod1();
        clientMethod2();
        System.out.println("======================= end of main() ======================");
    }

    private static void clientMethod1() {
        BookService service = new BookService();
        service.test();
    }

    private static void clientMethod2() {
        BookService service = new BookService();
        //service.test();
    }
}
