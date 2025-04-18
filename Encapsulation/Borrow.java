package Encapsulation;

import java.util.List;
import java.util.Map;

public class Borrow {
    private List<String> books;
    private Map<String, String> borrowed;

    public Borrow(List<String> books){
        this.books = books;
    }

    public String borrowBook(int index, String personName){
        if(borrowed.get(index) != null){
            return personName + "'s Access can't be granted!";
        }
        borrowed.put(books.get(index), personName);
        return personName + " Successfully Borrowed the book" ;
    }



}
