public class Book {

    private int id;
    private String title;
    private String author;
    private boolean available;

    // Constructor
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setter
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Display book details
    public void displayBook() {
        System.out.println(
                id + " | " +
                        title + " | " +
                        author + " | " +
                        (available ? "Available" : "Issued")
        );
    }
}