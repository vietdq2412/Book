package book;

public class FictionBook extends Book {
    private String category;

    public FictionBook(int bookCode, String name, int price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public FictionBook() {
        this.name = "vien tuowng";
        this.category = "fiction";
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Fiction book   | code: " + bookCode + " - name: " + name + " - price: " + price + " - author: " + author + " - category: " + category;
    }
}
