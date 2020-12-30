package Objects;

public class User {

 private String firstName;
    public String lastName;

    public String output() {  //for return type i wont need parameter and loop in here so i should delete

           return "Hi my name is " + firstName + " " + lastName;

    }
    public String getFirstName() {
        return firstName.toUpperCase();

    }
    public void setFirstName(String fn) {
        firstName = fn;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String ln) {
        lastName = ln;
    }

}
