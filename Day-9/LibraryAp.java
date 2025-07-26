import java.time.LocalDate;
import java.util.*;

abstract class Entity {
    protected String id;
    protected String name;

    public Entity(String id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract void display();
}

class Book extends Entity {
    private String author;
    private boolean isIssued;
    private String issuedTo;
    private LocalDate issueDate;

    public Book(String id, String title, String author) {
        super(id, title);
        this.author = author;
        this.isIssued = false;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public String getIssuedTo() {
        return issuedTo;
    }

    public String getTitle() {
        return name;
    }

    public void issue(String memberId) {
        this.isIssued = true;
        this.issuedTo = memberId;
        this.issueDate = LocalDate.now();
    }

    public void returnBook() {
        this.isIssued = false;
        this.issuedTo = null;
        this.issueDate = null;
    }

    public void display() {
        System.out.println("[Book] ID: " + id + ", Title: " + name + ", Author: " + author +
                ", Status: " + (isIssued ? "Issued to " + issuedTo + " on " + issueDate : "Available"));
    }
}

class Member extends Entity {
    private String email;
    private String phone;
    private List<String> borrowedBooks;

    public Member(String id, String name, String email, String phone) {
        super(id, name);
        this.email = email;
        this.phone = phone;
        this.borrowedBooks = new ArrayList<>();
    }

    public void update(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void borrowBook(String bookTitle) {
        borrowedBooks.add(bookTitle);
    }

    public void returnBook(String bookTitle) {
        borrowedBooks.remove(bookTitle);
    }

    public void display() {
        System.out.println("[Member] ID: " + id + ", Name: " + name + ", Email: " + email + ", Phone: " + phone);
        if (borrowedBooks.isEmpty()) {
            System.out.println("  Status: No books borrowed.");
        } else {
            System.out.println("  Borrowed Books: " + String.join(", ", borrowedBooks));
        }
    }
}

class LibraryManager {
    private Map<String, Book> books = new LinkedHashMap<>();
    private Map<String, Member> members = new LinkedHashMap<>();

    public void addBook(String id, String title, String author) {
        if (books.containsKey(id)) {
            System.out.println("Book ID already exists!");
        } else {
            books.put(id, new Book(id, title, author));
            System.out.println("Book added.");
        }
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            books.values().forEach(Book::display);
        }
    }

    public void updateBook(String id, String title, String author) {
        Book book = books.get(id);
        if (book != null) {
            books.put(id, new Book(id, title, author));
            System.out.println("Book updated.");
        } else {
            System.out.println("Book not found.");
        }
    }

    public void deleteBook(String id) {
        if (books.remove(id) != null) {
            System.out.println("Book deleted.");
        } else {
            System.out.println("Book not found.");
        }
    }

    public void addMember(String id, String name, String email, String phone) {
        if (members.containsKey(id)) {
            System.out.println("Member ID already exists!");
        } else {
            members.put(id, new Member(id, name, email, phone));
            System.out.println("Member added.");
        }
    }

    public void viewMembers() {
        if (members.isEmpty()) {
            System.out.println("No members registered.");
        } else {
            members.values().forEach(Member::display);
        }
    }

    public void updateMember(String id, String name, String email, String phone) {
        Member m = members.get(id);
        if (m != null) {
            m.update(name, email, phone);
            System.out.println("Member updated.");
        } else {
            System.out.println("Member not found.");
        }
    }

    public void deleteMember(String id) {
        if (members.remove(id) != null) {
            System.out.println("Member deleted.");
        } else {
            System.out.println("Member not found.");
        }
    }

    public void issueBook(String bookId, String memberId) {
        Book book = books.get(bookId);
        Member member = members.get(memberId);
        if (book == null) {
            System.out.println("Book not found.");
        } else if (member == null) {
            System.out.println("Member not found.");
        } else if (book.isIssued()) {
            System.out.println("Book is already issued.");
        } else {
            book.issue(memberId);
            member.borrowBook(book.getTitle());
            System.out.println("Book issued successfully.");
        }
    }

    public void returnBook(String bookId) {
        Book book = books.get(bookId);
        if (book != null && book.isIssued()) {
            Member member = members.get(book.getIssuedTo());
            if (member != null) {
                member.returnBook(book.getTitle());
            }
            book.returnBook();
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Invalid return attempt.");
        }
    }
}

public class LibraryProje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryManager manager = new LibraryManager();

        while (true) {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book\n2. View Books\n3. Update Book\n4. Delete Book");
            System.out.println("5. Add Member\n6. View Members\n7. Update Member\n8. Delete Member");
            System.out.println("9. Issue Book\n10. Return Book\n11. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.print("How many books do you want to add? ");
                    int count = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < count; i++) {
                        System.out.println("\nEnter details for Book " + (i + 1));
                        System.out.print("Book ID: "); String id = sc.nextLine();
                        System.out.print("Title: "); String title = sc.nextLine();
                        System.out.print("Author: "); String author = sc.nextLine();
                        manager.addBook(id, title, author);
                    }
                }
                case 2 -> manager.viewBooks();
                case 3 -> {
                    System.out.print("Book ID: "); String id = sc.nextLine();
                    System.out.print("New Title: "); String title = sc.nextLine();
                    System.out.print("New Author: "); String author = sc.nextLine();
                    manager.updateBook(id, title, author);
                }
                case 4 -> {
                    System.out.print("Book ID: "); String id = sc.nextLine();
                    manager.deleteBook(id);
                }
                case 5 -> {
                    System.out.print("How many members do you want to add? ");
                    int count = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < count; i++) {
                        System.out.println("\nEnter details for Member " + (i + 1));
                        System.out.print("Member ID: "); String id = sc.nextLine();
                        System.out.print("Name: "); String name = sc.nextLine();

                        String email;
                        while (true) {
                            System.out.print("Email: ");
                            email = sc.nextLine();
                            if (isValidEmail(email)) break;
                            System.out.println("Invalid email! Must end with @gmail.com, .org, or @yahoo.com");
                        }

                        String phone;
                        while (true) {
                            System.out.print("Phone: ");
                            phone = sc.nextLine();
                            if (isValidPhone(phone)) break;
                            System.out.println("Invalid phone number! Must be 10 digits.");
                        }

                        manager.addMember(id, name, email, phone);
                    }
                }
                case 6 -> manager.viewMembers();
                case 7 -> {
                    System.out.print("Member ID: "); String id = sc.nextLine();
                    System.out.print("New Name: "); String name = sc.nextLine();

                    String email;
                    while (true) {
                        System.out.print("New Email: ");
                        email = sc.nextLine();
                        if (isValidEmail(email)) break;
                        System.out.println("Invalid email! Must end with @gmail.com, .org, or yahoo.com");
                    }

                    String phone;
                    while (true) {
                        System.out.print("New Phone: ");
                        phone = sc.nextLine();
                        if (isValidPhone(phone)) break;
                        System.out.println("Invalid phone number! Must be 10 digits.");
                    }

                    manager.updateMember(id, name, email, phone);
                }
                case 8 -> {
                    System.out.print("Member ID: "); String id = sc.nextLine();
                    manager.deleteMember(id);
                }
                case 9 -> {
                    System.out.print("Book ID: "); String bookId = sc.nextLine();
                    System.out.print("Member ID: "); String memberId = sc.nextLine();
                    manager.issueBook(bookId, memberId);
                }
                case 10 -> {
                    System.out.print("Book ID: "); String id = sc.nextLine();
                    manager.returnBook(id);
                }
                case 11 -> {
                    System.out.println("Exiting the system. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static boolean isValidEmail(String email) {
        return email.endsWith("@gmail.com") || email.endsWith(".org") || email.endsWith("@yahoo.com");
    }

    public static boolean isValidPhone(String phone) {
        return phone.matches("\\d{10}");
    }
}
