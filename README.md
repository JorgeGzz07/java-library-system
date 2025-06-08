# Java Library System

This is a simple Java project that models a basic library system using object-oriented programming principles. The system includes `Author` and `Book` classes that demonstrate class interaction, constructors, getters, and the use of the `toString()` method.

## Features

- Models a book with an associated author
- Demonstrates class composition (Book contains an Author)
- Uses constructors and getter methods
- Overrides `toString()` to format object output

## Classes

### `Author.java`
Represents an author with:
- Name
- Email
- Nationality

### `Book.java`
Represents a book with:
- Title
- Price
- An `Author` object

### `Main.java`
The entry point of the program:
- Creates an `Author` and `Book` object
- Prints the book's information, including the author's details

## How to Run

1. **Compile** the Java files:
   ```bash
   javac Author.java Book.java Main.java
2. Run the program:
java Main

Example Output

Book: The Bad Beginning, Price: $14.99
Author: Lemony Snicket, Email: lemony.snicket@example.com, Nationality: American
