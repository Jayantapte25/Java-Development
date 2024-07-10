import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Book {
    // Private attributes
    private String bookId;
    private String title;
    private String author;
    private Double price;
    private String genre;
    private int pages;

    // Default constructor
    public Book() {
    }

    // Parameterized constructor
    public Book(String bookId, String title, String author, Double price, String genre, int pages) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.genre = genre;
        this.pages = pages;
    }

    // Getters and setters
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getBookId() {
        return this.bookId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public Double getPrice() {
        return this.price;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getPages() {
        return this.pages;
    }

    // Method to generate the book map
    public Map<String, List<Book>> generateBookMap(List<Book> bookList) {
        Map<String, List<Book>> bookMap = new HashMap<>();
        for (Book book : bookList) {
            String genre = book.getGenre();
            if (bookMap.containsKey(genre)) {
                List<Book> booksForGenre = bookMap.get(genre);
                booksForGenre.add(book);
            } else {
                List<Book> booksForGenre = new ArrayList<>();
                booksForGenre.add(book);
                bookMap.put(genre, booksForGenre);
            }
        }
        return bookMap;
    }

    // Method to search books by genre
    public List<Book> searchBooks(Map<String, List<Book>> bookMap, String genre) {
        return bookMap.getOrDefault(genre, new ArrayList<>());
    }
}

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); // to clear the buffer

        List<Book> books = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the book " + i + " detail:");
            String[] buffer = sc.nextLine().split(",");
            // Trim whitespace around each token
            for (int j = 0; j < buffer.length; j++) {
                buffer[j] = buffer[j].trim();
            }
            Book book = new Book(buffer[0], buffer[1], buffer[2], Double.parseDouble(buffer[3]), buffer[4],
                    Integer.parseInt(buffer[5]));
            books.add(book);
        }

        Book bookHelper = new Book();
        Map<String, List<Book>> bookMap = bookHelper.generateBookMap(books);

        System.out.println("Enter the genre to be searched:");
        String genre = sc.nextLine();

        List<Book> booksForGenre = bookHelper.searchBooks(bookMap, genre);
        if (booksForGenre.isEmpty()) {
            System.out.println("Searched genre not found");
        } else {
            System.out.printf("%-10s %-20s %-15s %-10s %-10s %s\n", "Book Id", "Title", "Author", "Price", "Genre",
                    "Pages");
            for (Book book : booksForGenre) {
                System.out.printf("%-10s %-20s %-15s %-10.2f %-10s %d\n", book.getBookId(), book.getTitle(),
                        book.getAuthor(), book.getPrice(), book.getGenre(), book.getPages());
            }
        }
        sc.close();
    }
}
