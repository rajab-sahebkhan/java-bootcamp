package LibraryManagementSystem;

public class Book {

    private String title;
    private String author;
    private int numOfPages;
    private boolean borrowed;

    public Book(String title, String author, int numOfPages, boolean borrowed){
        this.title = title;
        this.author = author;
        this.numOfPages = numOfPages;
        this.borrowed = borrowed;
    }

    //Getters

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getNumOfPages(){
        return numOfPages;
    }

    public String toString(){
        return "Name: " + getTitle() + "\nAuthor: " + getAuthor() + "\nNumber of pages: " + getNumOfPages();
    }

    public boolean isBorrowed(){
        return borrowed;
    }

    public void setBorrowed(boolean borrowed){
        this.borrowed = borrowed;
    }

}
