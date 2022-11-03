package se.lexicon;

public class Book {

    private static int sequencer = 100;
    private static int order = 0;

    private String title;
    private String author;
    private boolean available;
    private int bookID;
    private Person holder;

    public Book() {
        this.bookID = ++sequencer;
        this.order = ++order;
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

    public static int getSequencer() {
        return sequencer;
    }

    public static void setSequencer(int sequencer) {
        Book.sequencer = sequencer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public Person getHolder() {
        return holder;
    }

    public void setHolder(Person holder) {
        this.holder = holder;
    }
}
