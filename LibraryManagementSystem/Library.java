package LibraryManagementSystem;


import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    Scanner sc = new Scanner(System.in);

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(String name, String author, int numOfPages, boolean borrowed){

        Book book = new Book(name, author, numOfPages, borrowed);
        books.add(book);
    }


    public void removeBook(String name){

        boolean found = false;

        if(books.isEmpty()){
            System.out.println("No books available in the library.");
        } else {
            for (int i = 0; i < books.size(); i++) {
                Book book = books.get(i);
                if (name.equalsIgnoreCase(book.getTitle())) {
                    found = true;
                    books.remove(i);
                    System.out.println(book.getTitle() + " was successfully removed.");

                    break;
                }
            }

            if(!found){
                System.out.println("Book not found.");
            }

        }

    }


    public void displayBooks(){

        if(books.isEmpty()){
            System.out.println("No books available in the library.");
        } else {

            int a = 1;

            for (Book book : books) {
                System.out.println(a + ".\n" + book);
                a++;
            }
        }

    }


    public void searchBook(String name){

        if(books.isEmpty()){
            System.out.println("No books available in the library.");
        } else {
            boolean found = false;

            for (int i = 0; i < books.size(); i++) {
                Book book = books.get(i);
                if (name.equalsIgnoreCase(book.getTitle())) {
                    found = true;
                    System.out.println(book);

                    break;
                }
            }

            if(!found){
                System.out.println("Book not found.");
            }

        }
    }


    public boolean borrowBook(String name){

        if(books.isEmpty()){
            System.out.println("No books available.");
            return false;
        }

        boolean found = false;

        for(int i=0; i < books.size(); i++){
            Book book = books.get(i);
            if(name.equalsIgnoreCase(book.getTitle())){
                found = true;

                if(book.isBorrowed()){
                    System.out.println("The book is already borrowed.");
                    return book.isBorrowed();
                } else {

                    System.out.println("The book was successfully borrowed.");
                    book.setBorrowed(true);
                    return book.isBorrowed();
                }
            }
        }
        if(!found){
            System.out.println("Book not found");
        }
        return false;
    }


    public boolean returnBook(String name){

        if(books.isEmpty()){
            System.out.println("No books available.");
            return false;
        }

        boolean found = false;

        for(int i=0; i < books.size(); i++){
            Book book = books.get(i);
            if(name.equalsIgnoreCase(book.getTitle())){
                found = true;

                if(book.isBorrowed()){
                    System.out.println("The book is successfully returned.");
                    book.setBorrowed(false);
                    return book.isBorrowed();
                } else {

                    System.out.println("The book wasn't borrowed.");
                    return book.isBorrowed();
                }
            }
        }
        if(!found){
            System.out.println("Book not found");
        }
        return false;
    }


}
