package LibraryManagementSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        String name;
        String author;
        int numOfPages;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the book: ");
        name = sc.nextLine();

        System.out.println("Enter the name of the author: ");
        author = sc.nextLine();

        System.out.println("Enter the no of pages: ");
        numOfPages = sc.nextInt();

    }
}
