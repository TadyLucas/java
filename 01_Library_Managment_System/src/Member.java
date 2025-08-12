import java.util.ArrayList;
import java.util.List;

public class Member {
    private int memberId;
    private String name;
    List<Book> books = new ArrayList<>();

    public Member(int memberId, String name){
        this.memberId = memberId;
        this.name = name;
    }
    public int getMemberId(){
        return memberId;
    }
    public String getMemberName(){
        return name;
    }
    public void borrowBook(Book book){
        books.add(book);
    }
}
