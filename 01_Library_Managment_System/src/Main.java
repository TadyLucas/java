public class Main {
    public static void main(String[] args) {

        // Inicialization
        Library library = new Library(new Librarian(1, "Emma Thompson"));
        Library.Members memberManager =  library.new Members();
        Library.Books bookManager = library.new Books();

        for(Member member : CONST.members){
            memberManager.add(member);
        }
        for(Book book : CONST.books){
            bookManager.add(book);
        }

        bookManager.borrow("9780451524935", "Bob Smith");

        bookManager.print();
    }
}
