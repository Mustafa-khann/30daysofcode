import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}
// Declare your class here. Do not use the 'public' access modifier.
    // Declare the price instance variable
abstract class MyBook extends Book
{
    private int priceOfBook;
    private String title;
    private String author;
        /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    // Write your constructor here
     public abstract void MyBook(String title, String author, int price)
    {
        Super(title,author);
        this.title = title;
        this.author = author;
        this.priceOfBook = price;
    }
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    // Write your method here
    public void display()
    {
        System.out.println("Title:" + )
    }
    
// End class
}


public class Solution {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}