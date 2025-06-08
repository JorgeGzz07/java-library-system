public class Main {
    public static void main(String[] args) {
        // Create Author object
        Author author = new Author("Lemony Snicket", "lemony.snicket@example.com", "American");

        // Create Book object using the Author
        Book book = new Book("The Bad Beginning", 14.99, author);

        // Print book information including author details
        System.out.println(book);
    }
}
