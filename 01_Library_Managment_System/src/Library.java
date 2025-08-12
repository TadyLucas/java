import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;
    Librarian librarian;

    public Library(Librarian librarian) {
        this.librarian = librarian;
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }
    public class Members{
        public void add(Member member){
            members.add(member);
        }
        public void print(){
            for (Member member:members){
                System.out.println(member.getMemberId() + "|" + member.getMemberName());
            }
        }
        public List<Member> getList(){
            return members;
        }
    }

    public class Books{
        public void print(){
            for (Book book:books){
                System.out.println(book.getTitle() + "|" + book.getAuthor() + "|" + book.getISBN() + "|" + book.getIssued());
            }
        }
        public void borrow(String ISBN, String name) {
            boolean bookAvailable = false;
            boolean memberValid = false;
            for (Book book : books) {
                if (book.getISBN().equals(ISBN) && book.getIssued() == false){
                    for (Member member : members) {
                        if (member.getMemberName().equals(name)){
                            book.setIssued(true);
                            member.borrowBook(book);
                            return;
                        }
                    }
                    System.out.println("Member not found");
                    return;
                }
            }
            System.out.println("Book not found");
        }
        public List<Book> getList(){
            return books;
        }
        public void add(Book book){
            books.add(book);
        }
        public void remove(String ISBN){
            for(Book book: books){
                if(book.getISBN().equals(ISBN) && book.getIssued() == false){
                    books.remove(book);
                    return;
                }
            }
        }
    }


}
