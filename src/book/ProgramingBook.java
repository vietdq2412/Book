package book;

public class ProgramingBook extends Book {
    private String language;
    //private String frameWork;

    public ProgramingBook() {
        this.language = "Java";
        //this.frameWork = "frame work";
    }

//    public book.ProgramingBook(String language, String frameWork) {
//        this.name = "lap trinh";
//        this.language = language;
//        //this.frameWork = frameWork;
//    }

    public ProgramingBook(int bookCode, String name, int price, String author, String language) {
        super(bookCode, name, price, author);
        this.language = language;
    }

    @Override
    public String toString() {
        return "Programing book| code: " + bookCode + " - name: " + name + " - price: " + price + " - author: " + author + " - language: " + language;
    }
}
