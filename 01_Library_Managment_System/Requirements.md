1. Library Management System
   Classes:

   Book

        Fields: title, author, ISBN, isIssued (boolean)

        Methods: getters/setters, toString()

   Member

        Fields: memberId, name, List<Book> borrowedBooks

        Methods: borrow book, return book, getters/setters

   Staff (abstract)

        Fields: staffId, name

        Methods: abstract or default methods common to staff

   Librarian (extends Staff)

        Methods: addBook, removeBook, searchBook

   Library

        Fields: List<Book> books, List<Member> members, Librarian librarian

        Methods: add/remove/search books, register members, issue book to member, return book from member

Features:

    Add Book: Librarian can add new books to the library.

    Remove Book: Librarian can remove books from the library.

    Search Book: Search books by title, author, or ISBN.

    Register Member: Add new members to the library.

    Issue Book: Issue a book to a member if available.

    Return Book: Member returns a book, making it available again.

    Track Borrowed Books: Member can have multiple borrowed books tracked.