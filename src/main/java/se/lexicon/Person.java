package se.lexicon;

public class Person {

    // Fields
    private int id;
    private String firstName; // null
    private String lastName; // null


    public Person(String firstName, String lastName, int id) {
        this(firstName, lastName);
        setId(id);
    }

    public Person(String firstName, String lastName) {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) throw new IllegalArgumentException("firstName param was null");
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) throw new IllegalArgumentException("lastName param was null");
        this.lastName = lastName;
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
        return " Person: FirstName: " + firstName + " LastName: " + lastName + " ID: " + id;
    }
}
