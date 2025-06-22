package question.nested.book;

public class Library {

    private Book[] books;
    private int bookCount;


    private static class Book{
        private String bookName;
        private String author;

        public Book(String bookName, String author) {
            this.bookName = bookName;
            this.author = author;
        }
    }

    public Library(int size) {
       books = new Book[size];
       bookCount = 0;
    }

    public void addBook(String bookName, String author){
        if (bookCount < books.length) {
            books[bookCount] = new Book(bookName, author);
            bookCount++;
        } else {
            System.out.println("도서관 저장 공간 부족");
        }
    }

    public void showBooks(){
        System.out.println("책 목록 출력");
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            System.out.println("도서 제목: " +book.bookName + "저자: " +book.author);
        }
    }

}
