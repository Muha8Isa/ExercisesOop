package se.lexicon;

public class Person {

    // Fields

    private static int order = 0;
    private static int sequencer = 465;
    private final int id;
    private final int idd;
    private final String firstName; // null
    private final String lastName; // null


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = ++sequencer;
        this.idd = ++order;
    }

    public String personInformation() {
        return " Person#" + idd +" FirstName: " + firstName + ", LastName: " + lastName + ", ID: " + id;
    }
}
