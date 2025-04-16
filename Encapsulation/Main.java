package Encapsulation;

public class Main{
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "JK Rowling", 400);
        Book book2 = new Book("Da Vinci Code", "Dan Brown", 500);
        Book book3 = new Book("Noli Me Tangere", "Rizal", 1000);

        book1.print();
        book2.print();
        book3.print();
    }
}