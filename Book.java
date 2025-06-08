public class Book {
    private String title;
    private double price;
    private Author author; // Association with Author

    // Constructor
    public Book(String title, double price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }

    // toString override
    @Override
    public String toString() {
        return "Book: " + title + ", Price: $" + price + "\n" + author.toString();
    }
}
