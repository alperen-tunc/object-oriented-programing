package Tutorial.src._15_Lambda;

public class Application
{
    public static void main(String[] args)
    {
        Book book1 = new Book(22.22, "alice");
        Book book2 = new Book(11.11, "Dragon");

        BookStore store = new BookStore(new BookManagerPrice());

        store.setBookManager(new BookManager()
        {
            @Override
            public double manage(Book b1, Book b2)
            {
                return b1.getPrice() - b2.getPrice();
            }
        });

        BookManager manager = (Book b1, Book b2) ->{
            System.out.println("Die Namen dieser Bücher " + b1.getName() + " und " + b2.getName());
            return b1.getPrice() * b2.getPrice();
        } ;

        store.setBookManager(manager);

        double price = store.getManager().manage(new Book(9.99, "Deat"), new Book(19.99, "Note"));
        System.out.println(price);

        BookManager manager2 = (b1, b2) ->{
            System.out.println("Die Namen dieser Bücher " + b1.getName() + " und " + b2.getName());
            return b1.getPrice() + b2.getPrice();
         };

        store.setBookManager(manager2);
        double price2 = store.getManager().manage(book1, book2);
        System.out.println(price2);

        store.setBookManager((b1, b2) -> b1.getPrice() - b2.getPrice());
        double price3 = store.getManager().manage(book1, book2);
        System.out.println(price3);


        System.out.println("\n\nEnd of Main..");
    }
}
