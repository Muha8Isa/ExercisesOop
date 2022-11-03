package se.lexicon;

public class Person {

    // Fields

    private static int order = 0;
    private static int sequencer = 465;
    private int id;
    private int idd;
    private String firstName; // null
    private String lastName; // null


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = ++sequencer;
        this.idd = ++order;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) throw new IllegalArgumentException("firstName param was null");
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) throw new IllegalArgumentException("lastName param was null");
        this.lastName = lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String personInformation() {
        return " Person#" + idd +" FirstName: " + firstName + ", LastName: " + lastName + ", ID: " + id;
    }
}
