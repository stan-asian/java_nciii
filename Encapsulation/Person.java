package Encapsulation;

public class Person {
    
    private String fName;
    private String lName;
    private String fullName;

    public Person(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
        this.fullName = this.fName + " " + this.lName;
    }

    public String getFullName(){
        return this.fullName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

}
