package Encapsulation;

public class Book {
    private String title;
    private String author;
    private int price;

    // CONSTRUCTOR
    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // SETTERS
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(int price){
        this.price = price;
    }

    // GETTERS
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    
    public int getChange(){
        return this.price;
    }

    public void print(){
        
        System.out.println("=====================================================");
        System.out.println("Book Title:  " + getTitle());
        System.out.println("Book Author: " + getAuthor());
        System.out.println("Book Price:  " + getChange());
    }


}
