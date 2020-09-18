import book.Book;
import book.BookList;
import book.FictionBook;
import book.ProgramingBook;

import java.util.Scanner;


public class Main {
    static int numberOfBook = 1;
    static Book[] bookList = new Book[numberOfBook];
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        printMenu();
        System.out.println("enter your choice: ");
        int choice = sc.nextInt();

        while (choice != 4) {
            createMenu(choice);
            printMenu();
            System.out.println("enter your choice: ");
            choice = sc.nextInt();
        }

        Book test = new ProgramingBook();

        System.out.println(test instanceof ProgramingBook);
    }

    ////////////////////////////////////////////////////////////
    public static Book[] updateBookList(Book[] arr) {  // UPDATE
        Book[] list = new Book[arr.length + 1];
        System.arraycopy(arr, 0, list, 0, arr.length);
        list[list.length - 1] = new Book(-1);
        return list;
    }

    public static void addBook(Book book, Book[] arr) {   //ADD
        arr[arr.length - 1] = book;
        numberOfBook++;
    }

    public static void showBookList(Book[] arr) {   //SHOW
        if (arr[0] == null) {
            return;
        }
        System.out.println("-----------------------------" +
                "\n book.Book list: ");
        for (Book i : arr) {
            boolean c = i.getBookCode() == -1;
            if (c) {
                continue;
            }
            System.out.println(i.toString());
        }
        System.out.println("Total price: " + totalPrice(bookList));

    }

    public static int totalPrice(Book[] bookArr) {  //TOTAL PRICE
        int total = 0;
        for (int i = 0; i < bookArr.length; i++) {
            total += bookArr[i].getPrice();
        }
        return total;
    }

    //////////////////////////////////////////////////////////////
    public static void printMenu() {
        System.out.println("----Menu----" +
                "\n1. Add book" +
                "\n2. option 2" +
                "\n3. Show all book" +
                "\n4. Exit" +
                "\n_________________________" +
                "\n");
    }

    /////////////////////// input book's properties
    static int bookCode;
    static String bookName;
    static int bookPrice;
    static String bookAuthor;

    public static void inputBookData() {
        System.out.println("nhập book code: ");
        bookCode = sc.nextInt();
        sc.nextLine();
        System.out.println("enter book name: ");
        bookName = sc.nextLine();
        System.out.println("enter price: ");
        bookPrice = sc.nextInt();
        sc.nextLine();
        System.out.println("enter author: ");
        bookAuthor = sc.nextLine();
    }


    public static void createMenu(int choice) {

        switch (choice) {
            case 1:
                int choice1;
                System.out.println("---Add menu---" +
                        "\n1. Add fiction book" +
                        "\n2. Add programing book" +
                        "\n3. Exit" +
                        "\n--------------------------");
                System.out.println("enter your choice: ");
                choice1 = sc.nextInt();

                while (choice1 != 3) {
                    switch (choice1) {
                        case 1:
                            inputBookData();
                            System.out.println("enter category: ");
                            String category = sc.nextLine();

                            Book fictionBook = new FictionBook(bookCode, bookName, bookPrice, bookAuthor, category);
                            addBook(fictionBook, bookList);
                            bookList = updateBookList(bookList);
                            break;
                        case 2:
                            inputBookData();
                            System.out.println("enter language: ");
                            String language = sc.nextLine();

                            Book programingBook = new ProgramingBook(bookCode, bookName, bookPrice, bookAuthor, language);
                            addBook(programingBook, bookList);
                            bookList = updateBookList(bookList);
                            break;
                        default:
                            System.out.println("enter a number 1-3 !");
                    }
                    System.out.println("---Add menu---" +
                            "\n1. Add fiction book" +
                            "\n2. Add programing book" +
                            "\n3. Exit" +
                            "\n--------------------------");
                    System.out.println("enter your choice1: ");
                    choice1 = sc.nextInt();
                }
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                showBookList(bookList);
                break;
            default:
                System.out.println("enter 1-4 !");
        }
    }


}
