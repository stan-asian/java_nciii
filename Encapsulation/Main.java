package Encapsulation;

public class Main{

    /*
     * FLOW OF THE PROGRAM:
     * 
     * Classes:
     *  Main--> run the programs
     *  Person --> contains person properties
     *  Books --> contains books properties
     *  Secure --> logic, the books cant be borrowed by other person if the book was already possession of other person.
     * 
     */

    public static void main(String[] args) {

        Person person1 = new Person("Stanley", "Panag");

        System.out.println(person1.getFullName());
    }
}