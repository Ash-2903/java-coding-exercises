// create a class with three fields (instance variables) with the names firstName, lastName of type String and age of type int.
// Method named isTeen, needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false
// Method named getFullName, needs to return the full name of the person.

public class Person {
    
    private String firstName;
    private String lastName;
    private int age;
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age<0 || age>100) {
            age=0;
        }
        this.age = age;
    }
    
    public boolean isTeen () {
        if(age>12 && age<20) {
            return true;
        }
        return false;
    }
    
    public String getFullName() {
        return ( firstName.isEmpty() && lastName.isEmpty() ? "" : 
        ( firstName.isEmpty() ? lastName : ( lastName.isEmpty() ? firstName : firstName + " " + lastName ) ) );
    }
    
}