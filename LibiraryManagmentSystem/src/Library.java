import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    // Add book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Show all books
    public void showBooks() {

        System.out.println("\nID | Title | Author | Status");

        for (Book book : books) {
            book.displayBook();
        }
    }

    // Add member
    public void addMember(Member member) {

        members.add(member);
        System.out.println("Member added successfully!");
    }

    // Show all members
    public void showMembers() {

        System.out.println("\nID | Name");

        for (Member member : members) {
            member.displayMember();
        }
    }

    // Issue book
    public void issueBook(int bookId) {

        for (Book book : books) {

            if (book.getId() == bookId) {

                if (book.isAvailable()) {

                    book.setAvailable(false);
                    System.out.println("Book issued successfully!");

                } else {

                    System.out.println("Book is already issued!");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    // Return book
    public void returnBook(int bookId) {

        for (Book book : books) {

            if (book.getId() == bookId) {

                if (!book.isAvailable()) {

                    book.setAvailable(true);
                    System.out.println("Book returned successfully!");

                } else {

                    System.out.println("Book was not issued!");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }
}