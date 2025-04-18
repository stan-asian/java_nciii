package Encapsulation;

public class Person {
    
    private String fName;
    private String lName;
    private String fullName = fName + lName;

    public Person(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }

    public String getFullName(){
        return this.fullName;
    }
}
