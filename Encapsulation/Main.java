package Encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main{

    /*
     * FLOW OF THE PROGRAM:
     * 
     * Classes:
     *  Main--> run the programs
     *  Person --> contains person properties
     *  Books --> contains books properties
     *  Borrow --> logic, the books cant be borrowed by other person if the book was already in possession of other person.
     * 
     */

    public static void main(String[] args) {

        //PERSONS
        Person person1 = new Person("Stanley", "Panag");
        Person person2 = new Person("Maria", "Pascual");
        Person person3 = new Person("Roberto", "Ong");
        Person person4 = new Person("Bong", "Revilla");
        Person person5 = new Person("Mar", "Roxas");

        //BOOKS
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy");
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy");
        Book book3 = new Book("1984", "George Orwell", "Dystopian");
        Book book4 = new Book("To Kill a Mockingbird", "Harper Lee", "Classic");
        Book book5 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic");


        List<String> books = new ArrayList<>();

        books.add(0, book1.getBookTitle());
        books.add(1, book2.getBookTitle());
        books.add(2, book3.getBookTitle());
        books.add(3, book4.getBookTitle());
        books.add(4, book5.getBookTitle());


        Borrow borrow = new Borrow(books);

        String one = borrow.borrowBook(0, person1.getFullName());
        String two = borrow.borrowBook(1, person2.getFullName());
        String three = borrow.borrowBook(2, person3.getFullName());
        String four = borrow.borrowBook(3, person4.getFullName());
        String five = borrow.borrowBook(4, person5.getFullName());


        System.out.println(one);
        System.out.println("=======================");
        System.out.println(two);
        System.out.println("=======================");
        System.out.println(three);
        System.out.println("=======================");
        System.out.println(four);
        System.out.println("=======================");
        System.out.println(five);
        System.out.println("=======================");
    }
}