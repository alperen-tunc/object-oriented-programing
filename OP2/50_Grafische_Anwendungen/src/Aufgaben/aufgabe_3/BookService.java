package Aufgaben.aufgabe_3;


import java.util.ArrayList;
import java.util.List;

public class BookService
{
    private List<Book> bookList = new ArrayList<>();
    private int nextId = 1;

    public BookService() { // Bücherliste initialiseren für Testzwecke
        save( getSampleBook(1));
        save( getSampleBook(2));
        save( getSampleBook(3));
    }

    public void save( Book book ) {
        book.setId(nextId);
        bookList.add(book);
        nextId++;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void update( Book book ) {
        for( int i = 0 ; i < bookList.size() ; i++ ) {
            Book currentBook = bookList.get(i);
            if (currentBook.getId() == book.getId()) {
                bookList.set(i, book);
            }
        }
    }



    public void delete( int id ) {
        for( int i = 0 ; i < bookList.size() ; i++ ) {
            Book book = bookList.get(i);
            if (book.getId() == id) {
                bookList.remove(i);
            }
        }
    }

    public Book getSampleBook(int i) {
        if (i == 1)
            return new Book("Java ist auch eine Insel", "Rheinwerk Computing",
                            "978-3-8362-1802-3", "Christian Ullenboom", "2011");
        else if (i == 2)
            return new Book("Professionell entwickeln mit Java EE 7", "Rheinwerk Computing",
                            "978-3-8362-2004-0", "Alexander Salvanos", "2014");
        else if (i == 3)
            return new Book("OCEJWCD Study Companion", "Garner Press",
                            "978-0955160349", "Charles Lyons", "15. August 2012");
        else
            return null;

    }
}
