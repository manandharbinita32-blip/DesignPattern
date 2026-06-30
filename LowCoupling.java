package DesignPattern;

// Abstraction
interface Book {
    void getBookDetails();
}

// Implementation 1
class TextBook implements Book {

    @Override
    public void getBookDetails() {
        System.out.println("Textbook issued");
    }
}

// Implementation 2
class Novel implements Book {

    @Override
    public void getBookDetails() {
        System.out.println("Novel issued");
    }
}

// Library depends on abstraction
class Library {

    private Book book;

    public Library(Book book) {
        this.book = book;
    }

    public void issueBook() {
        book.getBookDetails();
    }
}

// Main class
public class LowCoupling {

    public static void main(String[] args) {

        Library l1 = new Library(new TextBook());
        l1.issueBook();

        Library l2 = new Library(new Novel());
        l2.issueBook();
    }
}