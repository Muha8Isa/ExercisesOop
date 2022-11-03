package se.lexicon;

public class Book {

    private static int sequencer = 100;
    private static int order = 0;

    private String title;
    private String author;
    private boolean available;
    private final int bookID;
    private Person holder;

    public Book() {
        this.bookID = ++sequencer;
        ++order;
    }

    public Book(String title, String author, boolean available) {
        this();
        setTitle(title);
        this.author = author;
        this.available = available;
    }
    public String getBookInformation() {
        return "Book#" +order + " Id: " + bookID + ", Title: " + title + ", Author: " + author + ", Availability: " + available;
    }

    public String getHolderInformation() {
        if (holder != null) {
            return holder.personInformation();
        } else {
            return null;
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setHolder(Person holder) {
        this.holder = holder;
    }
}
