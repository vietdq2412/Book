package book;

public class BookList {
    public int numberOfBook = 1;
    public Book[] list = new Book[numberOfBook];

    /////contructor
    public Book getBook(int index) {
        return this.list[index];
    }

    public BookList() {
    }

    public BookList(int numberOfBook, Book[] bookList) {
        this.numberOfBook = numberOfBook;
        this.list = bookList;
    }

    /////method

    public int getNumberOfBook() {
        return numberOfBook;
    }

    public Book[] getList() {
        return list;
    }

    public Book[] updateBookList() {  // UPDATE
        Book[] l = new Book[this.list.length + 1];
        System.arraycopy(list, 0, list, 0, list.length);
        list[list.length - 1] = new Book(-1);
        return l;
    }

    public void addBook(Book book) {   //ADD
        this.list[this.list.length - 1] = book;
        this.numberOfBook++;
    }

    public void showBookList() {   //SHOW
        if (list[0] == null) {
            return;
        }
        System.out.println("-----------------------------" +
                "\n book.Book list: ");
        for (Book i : list) {
            boolean c = i.getBookCode() == -1;
            if (c) {
                continue;
            }
            System.out.println(i.toString());
        }
        System.out.println("Total price: " + totalPrice());

    }

    public int totalPrice() {  //TOTAL PRICE
        int total = 0;
        for (int i = 0; i < list.length; i++) {
            total += list[i].getPrice();
        }
        return total;
    }
}
