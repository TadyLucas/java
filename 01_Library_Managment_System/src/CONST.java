import java.util.Arrays;
import java.util.List;

public interface CONST {
    List<Book> books = Arrays.asList(
            new Book("1984", "George Orwell", "9780451524935", Boolean.FALSE),
            new Book("To Kill a Mockingbird", "Harper Lee", "9780060935467", Boolean.FALSE),
            new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", Boolean.FALSE),
            new Book("Brave New World", "Aldous Huxley", "9780060850524", Boolean.FALSE),
            new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488", Boolean.FALSE)
    );
    List<Member> members = Arrays.asList(
            new Member(101, "Alice Johnson"),
            new Member(102, "Bob Smith"),
            new Member(103, "Charlie Brown")
    );


}
