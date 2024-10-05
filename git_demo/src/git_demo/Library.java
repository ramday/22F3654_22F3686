import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<String> books = new ArrayList<>();

    public void addBook(String bookName) {
        books.add(bookName);
        System.out.println(bookName + " added to library.");
    }

    public void listBooks() {
        System.out.println("Books in library: " + books);
    }
    
    public boolean searchBook(String bookName) {
    	return books.contains(bookName);
    	}

    public static void main(String[] args) {
        Library myLibrary = new Library();
        myLibrary.addBook("1984 by George Orwell");
        myLibrary.addBook("To Kill a Mockingbird by Harper Lee");
        myLibrary.listBooks();
    }
       public void removeBook(String bookName) {
       if (books.remove(bookName)) {
           System.out.println(bookName + " removed from library.");
       } else {
           System.out.println(bookName + " not found in library.");
       }
   }

}
