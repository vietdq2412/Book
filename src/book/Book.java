package book;

public class Book {
    protected int bookCode;
    protected String name;
    protected int price;
    protected String author;

    public Book() {
        this.bookCode = -1;
        this.name = "name";
        this.price = 0;
        this.author = "author";
    }

    public Book(int code) {
        this.bookCode = code;
    }

    public Book(int bookCode, String name, int price, String author) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBookCode() {
        return bookCode;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }
    @Override
    public String toString(){
        return "book code: "+ bookCode + " - name: " + name+ " - price: "+ price+ " - author: "+ author;
    }
}
